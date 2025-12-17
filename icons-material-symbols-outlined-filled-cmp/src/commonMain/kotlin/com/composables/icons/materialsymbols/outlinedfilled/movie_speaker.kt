package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Movie_speaker: ImageVector
    get() {
        if (_Movie_speaker != null) return _Movie_speaker!!
        
        _Movie_speaker = ImageVector.Builder(
            name = "movie_speaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 880f)
                lineTo(520f, 760f)
                horizontalLineTo(400f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(120f)
                lineToRelative(120f, -120f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(80f, 36f)
                verticalLineToRelative(-82f)
                quadToRelative(53f, -14f, 86.5f, -56.5f)
                reflectiveQuadTo(840f, 680f)
                quadToRelative(0f, -55f, -33.5f, -97.5f)
                reflectiveQuadTo(720f, 526f)
                verticalLineToRelative(-82f)
                quadToRelative(87f, 15f, 143.5f, 81.5f)
                reflectiveQuadTo(920f, 680f)
                quadToRelative(0f, 88f, -56.5f, 154.5f)
                reflectiveQuadTo(720f, 916f)
                close()
                moveToRelative(0f, -144f)
                verticalLineToRelative(-184f)
                quadToRelative(27f, 12f, 43.5f, 37f)
                reflectiveQuadToRelative(16.5f, 55f)
                quadToRelative(0f, 30f, -16.5f, 55f)
                reflectiveQuadTo(720f, 772f)
                close()
                moveToRelative(-560f, 28f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(80f, 160f)
                horizontalLineToRelative(120f)
                lineToRelative(-80f, -160f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 160f)
                horizontalLineToRelative(120f)
                lineToRelative(-80f, -160f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 160f)
                horizontalLineToRelative(120f)
                lineToRelative(-80f, -160f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(191f)
                quadToRelative(-39f, -30f, -83.5f, -50.5f)
                reflectiveQuadTo(702f, 360f)
                horizontalLineToRelative(-55f)
                lineTo(487f, 520f)
                horizontalLineTo(320f)
                verticalLineToRelative(280f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Movie_speaker!!
    }

private var _Movie_speaker: ImageVector? = null

