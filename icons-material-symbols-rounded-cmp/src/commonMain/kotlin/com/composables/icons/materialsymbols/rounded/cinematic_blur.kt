package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Cinematic_blur: ImageVector
    get() {
        if (_Cinematic_blur != null) return _Cinematic_blur!!
        
        _Cinematic_blur = ImageVector.Builder(
            name = "cinematic_blur",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 120f)
                lineToRelative(65f, 130f)
                quadToRelative(7f, 14f, 20f, 22f)
                reflectiveQuadToRelative(28f, 8f)
                quadToRelative(30f, 0f, 46f, -25.5f)
                reflectiveQuadToRelative(2f, -52.5f)
                lineToRelative(-41f, -82f)
                horizontalLineToRelative(80f)
                lineToRelative(65f, 130f)
                quadToRelative(7f, 14f, 20f, 22f)
                reflectiveQuadToRelative(28f, 8f)
                quadToRelative(30f, 0f, 46f, -25.5f)
                reflectiveQuadToRelative(2f, -52.5f)
                lineToRelative(-41f, -82f)
                horizontalLineToRelative(80f)
                lineToRelative(65f, 130f)
                quadToRelative(7f, 14f, 20f, 22f)
                reflectiveQuadToRelative(28f, 8f)
                quadToRelative(30f, 0f, 46f, -25.5f)
                reflectiveQuadToRelative(2f, -52.5f)
                lineToRelative(-41f, -82f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                close()
                moveToRelative(0f, 240f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-400f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(400f)
                verticalLineToRelative(-400f)
                close()
                moveToRelative(192f, 360f)
                horizontalLineToRelative(256f)
                quadToRelative(12f, 0f, 20.5f, -9f)
                reflectiveQuadToRelative(8.5f, -23f)
                quadToRelative(0f, -17f, -10.5f, -33f)
                reflectiveQuadTo(596f, 627f)
                quadToRelative(-22f, -14f, -51f, -20.5f)
                reflectiveQuadToRelative(-65f, -6.5f)
                quadToRelative(-36f, 0f, -65f, 6.5f)
                reflectiveQuadTo(364f, 627f)
                quadToRelative(-20f, 12f, -31f, 28f)
                reflectiveQuadToRelative(-11f, 33f)
                quadToRelative(0f, 14f, 9f, 23f)
                reflectiveQuadToRelative(21f, 9f)
                close()
                moveToRelative(128f, -160f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
            }
        }.build()
        
        return _Cinematic_blur!!
    }

private var _Cinematic_blur: ImageVector? = null

