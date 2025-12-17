package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Wash: ImageVector
    get() {
        if (_Wash != null) return _Wash!!
        
        _Wash = ImageVector.Builder(
            name = "wash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-216f)
                quadToRelative(0f, -31f, 14.5f, -57.5f)
                reflectiveQuadTo(135f, 403f)
                lineToRelative(330f, -214f)
                lineToRelative(20f, 20f)
                quadToRelative(20f, 20f, 23.5f, 47.5f)
                reflectiveQuadTo(497f, 308f)
                lineToRelative(-45f, 72f)
                horizontalLineToRelative(308f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 420f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 460f)
                horizontalLineTo(480f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 600f)
                horizontalLineTo(480f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 700f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 740f)
                horizontalLineTo(480f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(460f, -560f)
                quadToRelative(-39f, 0f, -69.5f, -30.5f)
                reflectiveQuadTo(600f, 220f)
                quadToRelative(0f, -35f, 23f, -77.5f)
                reflectiveQuadTo(700f, 40f)
                quadToRelative(54f, 60f, 77f, 102.5f)
                reflectiveQuadToRelative(23f, 77.5f)
                quadToRelative(0f, 39f, -30.5f, 69.5f)
                reflectiveQuadTo(700f, 320f)
                close()
            }
        }.build()
        
        return _Wash!!
    }

private var _Wash: ImageVector? = null

