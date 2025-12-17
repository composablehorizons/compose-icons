package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Train: ImageVector
    get() {
        if (_Train != null) return _Train!!
        
        _Train = ImageVector.Builder(
            name = "train",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 96f)
                verticalLineToRelative(256f)
                curveToRelative(0f, 51.815f, -61.624f, 96f, -130.022f, 96f)
                lineToRelative(62.98f, 49.721f)
                curveTo(386.905f, 502.417f, 383.562f, 512f, 376f, 512f)
                horizontalLineTo(72f)
                curveToRelative(-7.578f, 0f, -10.892f, -9.594f, -4.957f, -14.279f)
                lineTo(130.022f, 448f)
                curveTo(61.82f, 448f, 0f, 403.954f, 0f, 352f)
                verticalLineTo(96f)
                curveTo(0f, 42.981f, 64f, 0f, 128f, 0f)
                horizontalLineToRelative(192f)
                curveToRelative(65f, 0f, 128f, 42.981f, 128f, 96f)
                close()
                moveToRelative(-48f, 136f)
                verticalLineTo(120f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(72f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(304f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                close()
                moveToRelative(-176f, 64f)
                curveToRelative(-30.928f, 0f, -56f, 25.072f, -56f, 56f)
                reflectiveCurveToRelative(25.072f, 56f, 56f, 56f)
                reflectiveCurveToRelative(56f, -25.072f, 56f, -56f)
                reflectiveCurveToRelative(-25.072f, -56f, -56f, -56f)
                close()
            }
        }.build()
        
        return _Train!!
    }

private var _Train: ImageVector? = null

