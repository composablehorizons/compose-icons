package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.BarsArrowDown: ImageVector
    get() {
        if (_BarsArrowDown != null) return _BarsArrowDown!!
        
        _BarsArrowDown = ImageVector.Builder(
            name = "bars-arrow-down",
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
                horizontalLineToRelative(9.75f)
                moveToRelative(4.5f, -4.5f)
                verticalLineToRelative(12f)
                moveToRelative(0f, 0f)
                lineToRelative(-3.75f, -3.75f)
                moveTo(17.25f, 21f)
                lineTo(21f, 17.25f)
            }
        }.build()
        
        return _BarsArrowDown!!
    }

private var _BarsArrowDown: ImageVector? = null

