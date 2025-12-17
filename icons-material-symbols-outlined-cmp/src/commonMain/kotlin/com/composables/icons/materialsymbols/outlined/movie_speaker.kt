package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Movie_speaker: ImageVector
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
                moveTo(160f, 720f)
                verticalLineToRelative(-320f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(0f, 80f)
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
                verticalLineToRelative(160f)
                horizontalLineTo(160f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(480f, 80f)
                lineTo(520f, 760f)
                horizontalLineTo(400f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(120f)
                lineToRelative(120f, -120f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(80f, 36f)
                verticalLineToRelative(-82f)
                quadToRelative(52f, -14f, 86f, -56f)
                reflectiveQuadToRelative(34f, -98f)
                quadToRelative(0f, -56f, -34f, -98f)
                reflectiveQuadToRelative(-86f, -56f)
                verticalLineToRelative(-82f)
                quadToRelative(86f, 14f, 143f, 80f)
                reflectiveQuadToRelative(57f, 156f)
                quadToRelative(0f, 90f, -57f, 156f)
                reflectiveQuadTo(720f, 916f)
                close()
                moveToRelative(0f, -144f)
                verticalLineToRelative(-184f)
                quadToRelative(27f, 11f, 43.5f, 36f)
                reflectiveQuadToRelative(16.5f, 56f)
                quadToRelative(0f, 31f, -16.5f, 56f)
                reflectiveQuadTo(720f, 772f)
                close()
            }
        }.build()
        
        return _Movie_speaker!!
    }

private var _Movie_speaker: ImageVector? = null

