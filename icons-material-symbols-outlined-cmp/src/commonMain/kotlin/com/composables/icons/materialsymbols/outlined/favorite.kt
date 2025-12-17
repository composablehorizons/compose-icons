package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Favorite: ImageVector
    get() {
        if (_Favorite != null) return _Favorite!!
        
        _Favorite = ImageVector.Builder(
            name = "favorite",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                lineToRelative(-58f, -52f)
                quadToRelative(-101f, -91f, -167f, -157f)
                reflectiveQuadTo(150f, 512.5f)
                quadTo(111f, 460f, 95.5f, 416f)
                reflectiveQuadTo(80f, 326f)
                quadToRelative(0f, -94f, 63f, -157f)
                reflectiveQuadToRelative(157f, -63f)
                quadToRelative(52f, 0f, 99f, 22f)
                reflectiveQuadToRelative(81f, 62f)
                quadToRelative(34f, -40f, 81f, -62f)
                reflectiveQuadToRelative(99f, -22f)
                quadToRelative(94f, 0f, 157f, 63f)
                reflectiveQuadToRelative(63f, 157f)
                quadToRelative(0f, 46f, -15.5f, 90f)
                reflectiveQuadTo(810f, 512.5f)
                quadTo(771f, 565f, 705f, 631f)
                reflectiveQuadTo(538f, 788f)
                lineToRelative(-58f, 52f)
                close()
                moveToRelative(0f, -108f)
                quadToRelative(96f, -86f, 158f, -147.5f)
                reflectiveQuadToRelative(98f, -107f)
                quadToRelative(36f, -45.5f, 50f, -81f)
                reflectiveQuadToRelative(14f, -70.5f)
                quadToRelative(0f, -60f, -40f, -100f)
                reflectiveQuadToRelative(-100f, -40f)
                quadToRelative(-47f, 0f, -87f, 26.5f)
                reflectiveQuadTo(518f, 280f)
                horizontalLineToRelative(-76f)
                quadToRelative(-15f, -41f, -55f, -67.5f)
                reflectiveQuadTo(300f, 186f)
                quadToRelative(-60f, 0f, -100f, 40f)
                reflectiveQuadToRelative(-40f, 100f)
                quadToRelative(0f, 35f, 14f, 70.5f)
                reflectiveQuadToRelative(50f, 81f)
                quadToRelative(36f, 45.5f, 98f, 107f)
                reflectiveQuadTo(480f, 732f)
                close()
                moveToRelative(0f, -273f)
                close()
            }
        }.build()
        
        return _Favorite!!
    }

private var _Favorite: ImageVector? = null

