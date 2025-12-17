package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Cog6Tooth: ImageVector
    get() {
        if (_Cog6Tooth != null) return _Cog6Tooth!!
        
        _Cog6Tooth = ImageVector.Builder(
            name = "cog-6-tooth",
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
                moveTo(9.594f, 3.94f)
                curveToRelative(0.09f, -0.542f, 0.56f, -0.94f, 1.11f, -0.94f)
                horizontalLineToRelative(2.593f)
                curveToRelative(0.55f, 0f, 1.02f, 0.398f, 1.11f, 0.94f)
                lineToRelative(0.213f, 1.281f)
                curveToRelative(0.063f, 0.374f, 0.313f, 0.686f, 0.645f, 0.87f)
                curveToRelative(0.074f, 0.04f, 0.147f, 0.083f, 0.22f, 0.127f)
                curveToRelative(0.325f, 0.196f, 0.72f, 0.257f, 1.075f, 0.124f)
                lineToRelative(1.217f, -0.456f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 1.37f, 0.49f)
                lineToRelative(1.296f, 2.247f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -0.26f, 1.431f)
                lineToRelative(-1.003f, 0.827f)
                curveToRelative(-0.293f, 0.241f, -0.438f, 0.613f, -0.43f, 0.992f)
                arcToRelative(7.723f, 7.723f, 0f, false, true, 0f, 0.255f)
                curveToRelative(-0.008f, 0.378f, 0.137f, 0.75f, 0.43f, 0.991f)
                lineToRelative(1.004f, 0.827f)
                curveToRelative(0.424f, 0.35f, 0.534f, 0.955f, 0.26f, 1.43f)
                lineToRelative(-1.298f, 2.247f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -1.369f, 0.491f)
                lineToRelative(-1.217f, -0.456f)
                curveToRelative(-0.355f, -0.133f, -0.75f, -0.072f, -1.076f, 0.124f)
                arcToRelative(6.47f, 6.47f, 0f, false, true, -0.22f, 0.128f)
                curveToRelative(-0.331f, 0.183f, -0.581f, 0.495f, -0.644f, 0.869f)
                lineToRelative(-0.213f, 1.281f)
                curveToRelative(-0.09f, 0.543f, -0.56f, 0.94f, -1.11f, 0.94f)
                horizontalLineToRelative(-2.594f)
                curveToRelative(-0.55f, 0f, -1.019f, -0.398f, -1.11f, -0.94f)
                lineToRelative(-0.213f, -1.281f)
                curveToRelative(-0.062f, -0.374f, -0.312f, -0.686f, -0.644f, -0.87f)
                arcToRelative(6.52f, 6.52f, 0f, false, true, -0.22f, -0.127f)
                curveToRelative(-0.325f, -0.196f, -0.72f, -0.257f, -1.076f, -0.124f)
                lineToRelative(-1.217f, 0.456f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -1.369f, -0.49f)
                lineToRelative(-1.297f, -2.247f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 0.26f, -1.431f)
                lineToRelative(1.004f, -0.827f)
                curveToRelative(0.292f, -0.24f, 0.437f, -0.613f, 0.43f, -0.991f)
                arcToRelative(6.932f, 6.932f, 0f, false, true, 0f, -0.255f)
                curveToRelative(0.007f, -0.38f, -0.138f, -0.751f, -0.43f, -0.992f)
                lineToRelative(-1.004f, -0.827f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -0.26f, -1.43f)
                lineToRelative(1.297f, -2.247f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 1.37f, -0.491f)
                lineToRelative(1.216f, 0.456f)
                curveToRelative(0.356f, 0.133f, 0.751f, 0.072f, 1.076f, -0.124f)
                curveToRelative(0.072f, -0.044f, 0.146f, -0.086f, 0.22f, -0.128f)
                curveToRelative(0.332f, -0.183f, 0.582f, -0.495f, 0.644f, -0.869f)
                lineToRelative(0.214f, -1.28f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(15f, 12f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                close()
            }
        }.build()
        
        return _Cog6Tooth!!
    }

private var _Cog6Tooth: ImageVector? = null

