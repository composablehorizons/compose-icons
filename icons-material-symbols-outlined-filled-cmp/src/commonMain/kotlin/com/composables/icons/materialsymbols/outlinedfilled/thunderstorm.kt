package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Thunderstorm: ImageVector
    get() {
        if (_Thunderstorm != null) return _Thunderstorm!!
        
        _Thunderstorm = ImageVector.Builder(
            name = "thunderstorm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(462f, 960f)
                lineToRelative(94f, -107f)
                lineToRelative(-80f, -40f)
                lineToRelative(116f, -133f)
                horizontalLineToRelative(106f)
                lineToRelative(-94f, 107f)
                lineToRelative(80f, 40f)
                lineTo(568f, 960f)
                horizontalLineTo(462f)
                close()
                moveTo(222f, 960f)
                lineToRelative(94f, -107f)
                lineToRelative(-80f, -40f)
                lineToRelative(116f, -133f)
                horizontalLineToRelative(106f)
                lineToRelative(-94f, 107f)
                lineToRelative(80f, 40f)
                lineTo(328f, 960f)
                horizontalLineTo(222f)
                close()
                moveToRelative(78f, -320f)
                quadToRelative(-91f, 0f, -155.5f, -64.5f)
                reflectiveQuadTo(80f, 420f)
                quadToRelative(0f, -83f, 55f, -145f)
                reflectiveQuadToRelative(136f, -73f)
                quadToRelative(32f, -57f, 87.5f, -89.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(90f, 0f, 156.5f, 57.5f)
                reflectiveQuadTo(717f, 281f)
                quadToRelative(69f, 6f, 116f, 57f)
                reflectiveQuadToRelative(47f, 122f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(700f, 640f)
                horizontalLineTo(300f)
                close()
            }
        }.build()
        
        return _Thunderstorm!!
    }

private var _Thunderstorm: ImageVector? = null

