package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Sparkles: ImageVector
    get() {
        if (_Sparkles != null) return _Sparkles!!
        
        _Sparkles = ImageVector.Builder(
            name = "sparkles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(9.813f, 15.904f)
                lineTo(9f, 18.75f)
                lineToRelative(-0.813f, -2.846f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -3.09f, -3.09f)
                lineTo(2.25f, 12f)
                lineToRelative(2.846f, -0.813f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 3.09f, -3.09f)
                lineTo(9f, 5.25f)
                lineToRelative(0.813f, 2.846f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 3.09f, 3.09f)
                lineTo(15.75f, 12f)
                lineToRelative(-2.846f, 0.813f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -3.09f, 3.09f)
                close()
                moveTo(18.259f, 8.715f)
                lineTo(18f, 9.75f)
                lineToRelative(-0.259f, -1.035f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, -2.455f, -2.456f)
                lineTo(14.25f, 6f)
                lineToRelative(1.036f, -0.259f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, 2.455f, -2.456f)
                lineTo(18f, 2.25f)
                lineToRelative(0.259f, 1.035f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, 2.456f, 2.456f)
                lineTo(21.75f, 6f)
                lineToRelative(-1.035f, 0.259f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, -2.456f, 2.456f)
                close()
                moveTo(16.894f, 20.567f)
                lineTo(16.5f, 21.75f)
                lineToRelative(-0.394f, -1.183f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -1.423f, -1.423f)
                lineTo(13.5f, 18.75f)
                lineToRelative(1.183f, -0.394f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 1.423f, -1.423f)
                lineToRelative(0.394f, -1.183f)
                lineToRelative(0.394f, 1.183f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 1.423f, 1.423f)
                lineToRelative(1.183f, 0.394f)
                lineToRelative(-1.183f, 0.394f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -1.423f, 1.423f)
                close()
            }
        }.build()
        
        return _Sparkles!!
    }

private var _Sparkles: ImageVector? = null

