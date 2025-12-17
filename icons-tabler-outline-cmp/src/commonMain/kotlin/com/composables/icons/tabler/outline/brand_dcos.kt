package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandDcos: ImageVector
    get() {
        if (_BrandDcos != null) return _BrandDcos!!
        
        _BrandDcos = ImageVector.Builder(
            name = "brand-dcos",
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
                moveTo(3f, 18f)
                lineToRelative(18f, -12f)
                horizontalLineToRelative(-18f)
                lineToRelative(9f, 14f)
                lineToRelative(9f, -14f)
                verticalLineToRelative(10f)
                lineToRelative(-18f, -10f)
                close()
            }
        }.build()
        
        return _BrandDcos!!
    }

private var _BrandDcos: ImageVector? = null

