package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandBunpo: ImageVector
    get() {
        if (_BrandBunpo != null) return _BrandBunpo!!
        
        _BrandBunpo = ImageVector.Builder(
            name = "brand-bunpo",
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
                moveTo(3.9f, 7.205f)
                arcToRelative(17.764f, 17.764f, 0f, false, false, 4.008f, 2.753f)
                arcToRelative(7.917f, 7.917f, 0f, false, false, 4.57f, 0.567f)
                curveToRelative(1.5f, -0.33f, 2.907f, -1f, 4.121f, -1.956f)
                arcToRelative(12.107f, 12.107f, 0f, false, false, 2.892f, -2.903f)
                curveToRelative(0.603f, -0.94f, 0.745f, -1.766f, 0.484f, -2.231f)
                curveToRelative(-0.261f, -0.465f, -0.927f, -0.568f, -1.72f, -0.257f)
                arcToRelative(7.564f, 7.564f, 0f, false, false, -2.608f, 2.034f)
                arcToRelative(18.425f, 18.425f, 0f, false, false, -2.588f, 3.884f)
                arcToRelative(34.927f, 34.927f, 0f, false, false, -2.093f, 5.073f)
                arcToRelative(12.908f, 12.908f, 0f, false, false, -0.677f, 3.515f)
                curveToRelative(-0.07f, 0.752f, 0.07f, 1.51f, 0.405f, 2.184f)
                curveToRelative(0.323f, 0.562f, 1.06f, 1.132f, 2.343f, 1.132f)
                curveToRelative(3.474f, 0f, 5.093f, -3.53f, 5.463f, -5.62f)
                curveToRelative(0.24f, -1.365f, -0.085f, -3.197f, -1.182f, -4.01f)
            }
        }.build()
        
        return _BrandBunpo!!
    }

private var _BrandBunpo: ImageVector? = null

