package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandPrintables: ImageVector
    get() {
        if (_BrandPrintables != null) return _BrandPrintables!!
        
        _BrandPrintables = ImageVector.Builder(
            name = "brand-printables",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 21f)
                lineToRelative(12f, -7f)
                verticalLineToRelative(-7.5f)
                lineToRelative(-6f, -3.5f)
                lineToRelative(-6f, 3.5f)
                lineToRelative(6f, 3.5f)
                verticalLineToRelative(7.5f)
                lineToRelative(-6f, -3.5f)
                close()
            }
        }.build()
        
        return _BrandPrintables!!
    }

private var _BrandPrintables: ImageVector? = null

