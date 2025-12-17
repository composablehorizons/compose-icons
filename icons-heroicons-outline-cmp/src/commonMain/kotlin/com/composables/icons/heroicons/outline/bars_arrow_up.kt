package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.BarsArrowUp: ImageVector
    get() {
        if (_BarsArrowUp != null) return _BarsArrowUp!!
        
        _BarsArrowUp = ImageVector.Builder(
            name = "bars-arrow-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(3f, 4.5f)
                horizontalLineToRelative(14.25f)
                moveTo(3f, 9f)
                horizontalLineToRelative(9.75f)
                moveTo(3f, 13.5f)
                horizontalLineToRelative(5.25f)
                moveToRelative(5.25f, -0.75f)
                lineTo(17.25f, 9f)
                moveToRelative(0f, 0f)
                lineTo(21f, 12.75f)
                moveTo(17.25f, 9f)
                verticalLineToRelative(12f)
            }
        }.build()
        
        return _BarsArrowUp!!
    }

private var _BarsArrowUp: ImageVector? = null

