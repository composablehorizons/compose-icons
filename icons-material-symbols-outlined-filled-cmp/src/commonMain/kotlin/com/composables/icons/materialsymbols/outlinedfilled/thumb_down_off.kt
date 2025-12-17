package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Thumb_down_off: ImageVector
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
                horizontalLineToRelative(10f)
                verticalLineToRelative(13f)
                lineToRelative(-7f, 7f)
                lineToRelative(-1.25f, -1.25f)
                quadToRelative(-0.175f, -0.175f, -0.287f, -0.475f)
                quadToRelative(-0.113f, -0.3f, -0.113f, -0.575f)
                verticalLineToRelative(-0.35f)
                lineTo(8.45f, 16f)
                close()
                moveToRelative(15f, 0f)
                verticalLineTo(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(13f)
                close()
            }
        }.build()
        
        return _Thumb_down_off!!
    }

private var _Thumb_down_off: ImageVector? = null

