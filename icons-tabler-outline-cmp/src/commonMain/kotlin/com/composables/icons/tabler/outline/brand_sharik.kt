package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSharik: ImageVector
    get() {
        if (_BrandSharik != null) return _BrandSharik!!
        
        _BrandSharik = ImageVector.Builder(
            name = "brand-sharik",
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
                moveTo(4.281f, 16.606f)
                arcToRelative(8.968f, 8.968f, 0f, false, true, 1.363f, -10.977f)
                arcToRelative(9.033f, 9.033f, 0f, false, true, 11.011f, -1.346f)
                curveToRelative(-1.584f, 4.692f, -2.415f, 6.96f, -4.655f, 8.717f)
                curveToRelative(-1.584f, 1.242f, -3.836f, 2.24f, -7.719f, 3.606f)
                close()
                moveToRelative(16.335f, -7.306f)
                curveToRelative(2.113f, 7.59f, -4.892f, 13.361f, -11.302f, 11.264f)
                curveToRelative(1.931f, -3.1f, 3.235f, -4.606f, 4.686f, -6.065f)
                curveToRelative(1.705f, -1.715f, 3.591f, -3.23f, 6.616f, -5.199f)
                close()
            }
        }.build()
        
        return _BrandSharik!!
    }

private var _BrandSharik: ImageVector? = null

