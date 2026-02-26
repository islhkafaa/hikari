package tachiyomi.domain.manga.interactor

import kotlinx.coroutines.flow.Flow
import tachiyomi.domain.manga.model.Manga
import tachiyomi.domain.manga.repository.MangaRepository

class GetExcludedManga(
    private val mangaRepository: MangaRepository,
) {
    fun subscribe(sourceId: Long): Flow<List<Manga>> {
        return mangaRepository.getExcludedBySourceId(sourceId)
    }
}
