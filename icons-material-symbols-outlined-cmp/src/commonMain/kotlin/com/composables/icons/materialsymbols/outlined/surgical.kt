package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Surgical: ImageVector
    get() {
        if (_Surgical != null) return _Surgical!!
        
        _Surgical = ImageVector.Builder(
            name = "surgical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 614f)
                lineTo(346f, 464f)
                lineToRelative(332f, -332f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(93f, 93f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(828f, 282f)
                lineTo(496f, 614f)
                close()
                moveToRelative(0f, -114f)
                lineToRelative(248f, -247f)
                lineToRelative(-37f, -37f)
                lineToRelative(-247f, 248f)
                lineToRelative(36f, 36f)
                close()
                moveToRelative(-56f, 340f)
                lineToRelative(80f, -80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(440f)
                close()
                moveToRelative(-237f, 0f)
                quadToRelative(-46f, 0f, -88.5f, -18f)
                reflectiveQuadTo(40f, 772f)
                lineToRelative(265f, -264f)
                lineToRelative(104f, 104f)
                quadToRelative(14f, 14f, 22f, 32f)
                reflectiveQuadToRelative(8f, 38f)
                quadToRelative(0f, 20f, -8f, 38.5f)
                reflectiveQuadTo(409f, 753f)
                lineToRelative(-19f, 19f)
                quadToRelative(-32f, 32f, -74.5f, 50f)
                reflectiveQuadTo(227f, 840f)
                horizontalLineToRelative(-24f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(24f)
                quadToRelative(30f, 0f, 58f, -11.5f)
                reflectiveQuadToRelative(49f, -32.5f)
                lineToRelative(19f, -19f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                lineToRelative(-48f, -48f)
                lineToRelative(-136f, 135f)
                quadToRelative(8f, 2f, 17f, 3f)
                reflectiveQuadToRelative(17f, 1f)
                close()
                moveToRelative(541f, -507f)
                lineToRelative(-37f, -37f)
                lineToRelative(37f, 37f)
                close()
                moveTo(305f, 621f)
                close()
            }
        }.build()
        
        return _Surgical!!
    }

private var _Surgical: ImageVector? = null

