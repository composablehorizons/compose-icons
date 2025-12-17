package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Thumb_down_off: ImageVector
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
                quadToRelative(0f, -0.175f, 0.05f, -0.375f)
                reflectiveQuadToRelative(0.1f, -0.375f)
                lineToRelative(3f, -7.05f)
                quadToRelative(0.225f, -0.5f, 0.75f, -0.85f)
                reflectiveQuadTo(6f, 3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(13f)
                lineToRelative(-6f, 5.95f)
                quadToRelative(-0.375f, 0.375f, -0.887f, 0.437f)
                quadToRelative(-0.513f, 0.063f, -0.988f, -0.187f)
                reflectiveQuadToRelative(-0.7f, -0.7f)
                quadToRelative(-0.225f, -0.45f, -0.1f, -0.925f)
                lineTo(9.45f, 16f)
                close()
                moveToRelative(12f, -0.85f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                lineToRelative(-3f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                lineToRelative(-1.35f, 5.5f)
                close()
                moveTo(20f, 3f)
                quadToRelative(0.825f, 0f, 1.413f, 0.587f)
                quadTo(22f, 4.175f, 22f, 5f)
                verticalLineToRelative(9f)
                quadToRelative(0f, 0.825f, -0.587f, 1.412f)
                quadTo(20.825f, 16f, 20f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(-3f)
                verticalLineTo(3f)
                close()
                moveToRelative(-5f, 2f)
                verticalLineToRelative(10.15f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        
        return _Thumb_down_off!!
    }

private var _Thumb_down_off: ImageVector? = null

