package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.HandScissors: ImageVector
    get() {
        if (_HandScissors != null) return _HandScissors!!
        
        _HandScissors = ImageVector.Builder(
            name = "hand-scissors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 480f)
                lineToRelative(70f, -0.013f)
                curveToRelative(5.114f, 0f, 10.231f, -0.583f, 15.203f, -1.729f)
                lineToRelative(118.999f, -27.427f)
                curveTo(490.56f, 443.835f, 512f, 417.02f, 512f, 386.277f)
                verticalLineTo(180.575f)
                curveToRelative(0f, -23.845f, -13.03f, -45.951f, -34.005f, -57.69f)
                lineToRelative(-97.999f, -54.853f)
                curveToRelative(-34.409f, -19.261f, -67.263f, -5.824f, -92.218f, 24.733f)
                lineTo(142.85f, 37.008f)
                curveToRelative(-37.887f, -14.579f, -80.612f, 3.727f, -95.642f, 41.201f)
                curveToRelative(-15.098f, 37.642f, 3.635f, 80.37f, 41.942f, 95.112f)
                lineTo(168f, 192f)
                lineToRelative(-94f, -9.141f)
                curveToRelative(-40.804f, 0f, -74f, 32.811f, -74f, 73.14f)
                curveToRelative(0f, 40.33f, 33.196f, 73.141f, 74f, 73.141f)
                horizontalLineToRelative(87.635f)
                curveToRelative(-3.675f, 26.245f, 8.692f, 51.297f, 30.341f, 65.006f)
                curveTo(178.657f, 436.737f, 211.044f, 480f, 256f, 480f)
                close()
                moveToRelative(0f, -48.013f)
                curveToRelative(-25.16f, 0f, -25.12f, -36.567f, 0f, -36.567f)
                curveToRelative(8.837f, 0f, 16f, -7.163f, 16f, -16f)
                verticalLineToRelative(-6.856f)
                curveToRelative(0f, -8.837f, -7.163f, -16f, -16f, -16f)
                horizontalLineToRelative(-28f)
                curveToRelative(-25.159f, 0f, -25.122f, -36.567f, 0f, -36.567f)
                horizontalLineToRelative(28f)
                curveToRelative(8.837f, 0f, 16f, -7.163f, 16f, -16f)
                verticalLineToRelative(-6.856f)
                curveToRelative(0f, -8.837f, -7.163f, -16f, -16f, -16f)
                horizontalLineTo(74f)
                curveToRelative(-34.43f, 0f, -34.375f, -50.281f, 0f, -50.281f)
                horizontalLineToRelative(182f)
                curveToRelative(8.837f, 0f, 16f, -7.163f, 16f, -16f)
                verticalLineToRelative(-11.632f)
                arcToRelative(16f, 16f, 0f, false, false, -10.254f, -14.933f)
                lineTo(106.389f, 128.51f)
                curveToRelative(-31.552f, -12.14f, -13.432f, -59.283f, 19.222f, -46.717f)
                lineToRelative(166.549f, 64.091f)
                arcToRelative(16.001f, 16.001f, 0f, false, false, 18.139f, -4.812f)
                lineToRelative(21.764f, -26.647f)
                curveToRelative(5.82f, -7.127f, 16.348f, -9.064f, 24.488f, -4.508f)
                lineToRelative(98f, 54.854f)
                curveToRelative(5.828f, 3.263f, 9.449f, 9.318f, 9.449f, 15.805f)
                verticalLineToRelative(205.701f)
                curveToRelative(0f, 8.491f, -5.994f, 15.804f, -14.576f, 17.782f)
                lineToRelative(-119.001f, 27.427f)
                arcToRelative(19.743f, 19.743f, 0f, false, true, -4.423f, 0.502f)
                horizontalLineToRelative(-70f)
                close()
            }
        }.build()
        
        return _HandScissors!!
    }

private var _HandScissors: ImageVector? = null

