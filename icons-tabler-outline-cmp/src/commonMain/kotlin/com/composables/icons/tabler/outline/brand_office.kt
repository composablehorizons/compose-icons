package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandOffice: ImageVector
    get() {
        if (_BrandOffice != null) return _BrandOffice!!
        
        _BrandOffice = ImageVector.Builder(
            name = "brand-office",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 18f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-12f)
                lineToRelative(-5f, 2f)
                verticalLineToRelative(5f)
                lineToRelative(-4f, 2f)
                verticalLineToRelative(-8f)
                lineToRelative(9f, -4f)
                lineToRelative(7f, 2f)
                verticalLineToRelative(13f)
                lineToRelative(-7f, 3f)
                close()
            }
        }.build()
        
        return _BrandOffice!!
    }

private var _BrandOffice: ImageVector? = null

