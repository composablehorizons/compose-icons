package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandTiktok: ImageVector
    get() {
        if (_BrandTiktok != null) return _BrandTiktok!!
        
        _BrandTiktok = ImageVector.Builder(
            name = "brand-tiktok",
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
                moveTo(21f, 7.917f)
                verticalLineToRelative(4.034f)
                arcToRelative(9.948f, 9.948f, 0f, false, true, -5f, -1.951f)
                verticalLineToRelative(4.5f)
                arcToRelative(6.5f, 6.5f, 0f, true, true, -8f, -6.326f)
                verticalLineToRelative(4.326f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 4f, 2f)
                verticalLineToRelative(-11.5f)
                horizontalLineToRelative(4.083f)
                arcToRelative(6.005f, 6.005f, 0f, false, false, 4.917f, 4.917f)
                close()
            }
        }.build()
        
        return _BrandTiktok!!
    }

private var _BrandTiktok: ImageVector? = null

