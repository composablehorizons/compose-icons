package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Aod_watch: ImageVector
    get() {
        if (_Aod_watch != null) return _Aod_watch!!
        
        _Aod_watch = ImageVector.Builder(
            name = "aod_watch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 460f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(60f)
                horizontalLineTo(360f)
                close()
                moveToRelative(40f, 120f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(60f)
                horizontalLineTo(400f)
                close()
                moveTo(360f, 880f)
                lineToRelative(-54f, -182f)
                quadToRelative(-48f, -38f, -77f, -95f)
                reflectiveQuadToRelative(-29f, -123f)
                quadToRelative(0f, -66f, 29f, -123f)
                reflectiveQuadToRelative(77f, -95f)
                lineToRelative(54f, -182f)
                horizontalLineToRelative(240f)
                lineToRelative(54f, 182f)
                quadToRelative(48f, 38f, 77f, 95f)
                reflectiveQuadToRelative(29f, 123f)
                quadToRelative(0f, 66f, -29f, 123f)
                reflectiveQuadToRelative(-77f, 95f)
                lineTo(600f, 880f)
                horizontalLineTo(360f)
                close()
                moveToRelative(120f, -200f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(-76f, -470f)
                quadToRelative(20f, -5f, 38.5f, -8f)
                reflectiveQuadToRelative(37.5f, -3f)
                quadToRelative(19f, 0f, 37.5f, 3f)
                reflectiveQuadToRelative(38.5f, 8f)
                lineToRelative(-16f, -50f)
                horizontalLineTo(420f)
                lineToRelative(-16f, 50f)
                close()
                moveToRelative(16f, 590f)
                horizontalLineToRelative(120f)
                lineToRelative(16f, -50f)
                quadToRelative(-20f, 5f, -38.5f, 7.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(-19f, 0f, -37.5f, -2.5f)
                reflectiveQuadTo(404f, 750f)
                lineToRelative(16f, 50f)
                close()
                moveToRelative(-16f, -640f)
                horizontalLineToRelative(152f)
                horizontalLineToRelative(-152f)
                close()
                moveToRelative(16f, 640f)
                horizontalLineToRelative(-16f)
                horizontalLineToRelative(152f)
                horizontalLineToRelative(-136f)
                close()
            }
        }.build()
        
        return _Aod_watch!!
    }

private var _Aod_watch: ImageVector? = null

