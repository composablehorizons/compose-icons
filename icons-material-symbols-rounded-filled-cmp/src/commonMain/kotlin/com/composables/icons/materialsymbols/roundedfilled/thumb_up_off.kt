package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Thumb_up_off: ImageVector
    get() {
        if (_Thumb_up_off != null) return _Thumb_up_off!!
        
        _Thumb_up_off = ImageVector.Builder(
            name = "thumb_up_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 21f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(8f, 19.825f, 8f, 19f)
                verticalLineTo(8.825f)
                quadToRelative(0f, -0.4f, 0.163f, -0.763f)
                quadToRelative(0.162f, -0.362f, 0.437f, -0.637f)
                lineToRelative(5.425f, -5.4f)
                quadToRelative(0.375f, -0.35f, 0.888f, -0.425f)
                quadToRelative(0.512f, -0.075f, 0.987f, 0.175f)
                reflectiveQuadToRelative(0.687f, 0.7f)
                quadToRelative(0.213f, 0.45f, 0.088f, 0.925f)
                lineTo(15.55f, 8f)
                horizontalLineTo(21f)
                quadToRelative(0.8f, 0f, 1.4f, 0.6f)
                quadToRelative(0.6f, 0.6f, 0.6f, 1.4f)
                verticalLineToRelative(2f)
                quadToRelative(0f, 0.175f, -0.038f, 0.375f)
                quadToRelative(-0.037f, 0.2f, -0.112f, 0.375f)
                lineToRelative(-3f, 7.05f)
                quadToRelative(-0.225f, 0.5f, -0.75f, 0.85f)
                reflectiveQuadTo(18f, 21f)
                close()
                moveToRelative(-6f, 0f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(2f, 19.825f, 2f, 19f)
                verticalLineToRelative(-9f)
                quadToRelative(0f, -0.825f, 0.588f, -1.413f)
                quadTo(3.175f, 8f, 4f, 8f)
                reflectiveQuadToRelative(1.412f, 0.587f)
                quadTo(6f, 9.175f, 6f, 10f)
                verticalLineToRelative(9f)
                quadToRelative(0f, 0.825f, -0.588f, 1.413f)
                quadTo(4.825f, 21f, 4f, 21f)
                close()
            }
        }.build()
        
        return _Thumb_up_off!!
    }

private var _Thumb_up_off: ImageVector? = null

