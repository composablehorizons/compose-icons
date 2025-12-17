package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Dry: ImageVector
    get() {
        if (_Dry != null) return _Dry!!
        
        _Dry = ImageVector.Builder(
            name = "dry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(599f, 320f)
                quadToRelative(5f, -41f, -0.5f, -64.5f)
                reflectiveQuadTo(569f, 202f)
                quadToRelative(-31f, -40f, -41.5f, -77f)
                reflectiveQuadToRelative(-3.5f, -85f)
                horizontalLineToRelative(76f)
                quadToRelative(-8f, 51f, 5f, 75f)
                reflectiveQuadToRelative(36f, 56f)
                quadToRelative(26f, 35f, 34f, 69.5f)
                reflectiveQuadToRelative(1f, 79.5f)
                horizontalLineToRelative(-77f)
                close()
                moveToRelative(161f, 0f)
                quadToRelative(5f, -41f, -1f, -64.5f)
                reflectiveQuadTo(729f, 202f)
                quadToRelative(-31f, -40f, -41f, -77f)
                reflectiveQuadToRelative(-3f, -85f)
                horizontalLineToRelative(75f)
                quadToRelative(-8f, 51f, 5f, 75f)
                reflectiveQuadToRelative(36f, 56f)
                quadToRelative(26f, 35f, 34f, 69.5f)
                reflectiveQuadToRelative(1f, 79.5f)
                horizontalLineToRelative(-76f)
                close()
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
                horizontalLineTo(308f)
                lineToRelative(77f, -124f)
                lineToRelative(-207f, 134f)
                quadToRelative(-9f, 5f, -13.5f, 14f)
                reflectiveQuadToRelative(-4.5f, 20f)
                verticalLineToRelative(216f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(240f, 800f)
                horizontalLineToRelative(480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(240f, -280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 600f)
                horizontalLineTo(480f)
                close()
                moveToRelative(0f, 140f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 700f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 740f)
                horizontalLineTo(480f)
                close()
                moveTo(320f, 600f)
                close()
            }
        }.build()
        
        return _Dry!!
    }

private var _Dry: ImageVector? = null

