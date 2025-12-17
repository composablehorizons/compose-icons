package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Thumb_down_off: ImageVector
    get() {
        if (_Thumb_down_off != null) return _Thumb_down_off!!
        
        _Thumb_down_off = ImageVector.Builder(
            name = "thumb_down_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 16f)
                quadToRelative(-0.8f, 0f, -1.4f, -0.6f)
                quadTo(1f, 14.8f, 1f, 14f)
                verticalLineToRelative(-2f)
                quadToRelative(0f, -0.175f, 0.038f, -0.375f)
                quadToRelative(0.037f, -0.2f, 0.112f, -0.375f)
                lineToRelative(3f, -7.05f)
                quadToRelative(0.225f, -0.5f, 0.75f, -0.85f)
                reflectiveQuadTo(6f, 3f)
                horizontalLineToRelative(8f)
                quadToRelative(0.825f, 0f, 1.413f, 0.587f)
                quadTo(16f, 4.175f, 16f, 5f)
                verticalLineToRelative(10.175f)
                quadToRelative(0f, 0.4f, -0.162f, 0.763f)
                quadToRelative(-0.163f, 0.362f, -0.438f, 0.637f)
                lineToRelative(-5.425f, 5.4f)
                quadToRelative(-0.375f, 0.35f, -0.887f, 0.425f)
                quadToRelative(-0.513f, 0.075f, -0.988f, -0.175f)
                reflectiveQuadToRelative(-0.688f, -0.7f)
                quadToRelative(-0.212f, -0.45f, -0.087f, -0.925f)
                lineTo(8.45f, 16f)
                close()
                moveTo(20f, 3f)
                quadToRelative(0.825f, 0f, 1.413f, 0.587f)
                quadTo(22f, 4.175f, 22f, 5f)
                verticalLineToRelative(9f)
                quadToRelative(0f, 0.825f, -0.587f, 1.412f)
                quadTo(20.825f, 16f, 20f, 16f)
                quadToRelative(-0.825f, 0f, -1.413f, -0.588f)
                quadTo(18f, 14.825f, 18f, 14f)
                verticalLineTo(5f)
                quadToRelative(0f, -0.825f, 0.587f, -1.413f)
                quadTo(19.175f, 3f, 20f, 3f)
                close()
            }
        }.build()
        
        return _Thumb_down_off!!
    }

private var _Thumb_down_off: ImageVector? = null

