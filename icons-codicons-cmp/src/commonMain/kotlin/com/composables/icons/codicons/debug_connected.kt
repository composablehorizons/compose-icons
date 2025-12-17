package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugConnected: ImageVector
    get() {
        if (_DebugConnected != null) return _DebugConnected!!
        
        _DebugConnected = ImageVector.Builder(
            name = "debug-connected",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.01298f, 6.77501f)
                curveTo(5.52698f, 6.28801f, 4.73198f, 6.28801f, 4.24498f, 6.77501f)
                lineTo(4.02498f, 6.99501f)
                curveTo(3.34898f, 7.67001f, 2.98498f, 8.56901f, 2.99998f, 9.52401f)
                curveTo(3.01198f, 10.28f, 3.25998f, 10.994f, 3.70998f, 11.583f)
                lineTo(1.64698f, 13.646f)
                curveTo(1.45198f, 13.841f, 1.45198f, 14.158f, 1.64698f, 14.353f)
                curveTo(1.74498f, 14.451f, 1.87298f, 14.499f, 2.00098f, 14.499f)
                curveTo(2.12898f, 14.499f, 2.25698f, 14.45f, 2.35498f, 14.353f)
                lineTo(4.42498f, 12.283f)
                curveTo(5.02198f, 12.718f, 5.73698f, 12.935f, 6.46098f, 12.935f)
                curveTo(7.39898f, 12.935f, 8.34898f, 12.572f, 9.06498f, 11.855f)
                lineTo(9.19598f, 11.724f)
                curveTo(9.68298f, 11.237f, 9.68298f, 10.444f, 9.19598f, 9.95601f)
                lineTo(6.01398f, 6.77401f)
                lineTo(6.01298f, 6.77501f)
                close()
                moveTo(8.48798f, 11.018f)
                lineTo(8.35698f, 11.149f)
                curveTo(7.36298f, 12.144f, 5.76098f, 12.208f, 4.78898f, 11.291f)
                curveTo(4.29098f, 10.823f, 4.01198f, 10.19f, 4.00098f, 9.50801f)
                curveTo(3.99098f, 8.82601f, 4.25098f, 8.18401f, 4.73298f, 7.70201f)
                lineTo(4.95298f, 7.48201f)
                curveTo(5.00198f, 7.43301f, 5.06498f, 7.40901f, 5.12998f, 7.40901f)
                curveTo(5.19498f, 7.40901f, 5.25798f, 7.43301f, 5.30698f, 7.48201f)
                lineTo(8.48898f, 10.664f)
                curveTo(8.58698f, 10.762f, 8.58698f, 10.92f, 8.48898f, 11.018f)
                horizontalLineTo(8.48798f)
                close()
                moveTo(14.354f, 1.64601f)
                curveTo(14.159f, 1.45101f, 13.842f, 1.45101f, 13.647f, 1.64601f)
                lineTo(11.577f, 3.71601f)
                curveTo(10.207f, 2.71701f, 8.20698f, 2.87301f, 6.93698f, 4.14401f)
                lineTo(6.80598f, 4.27501f)
                curveTo(6.31898f, 4.76201f, 6.31898f, 5.55501f, 6.80598f, 6.04301f)
                lineTo(9.98798f, 9.22501f)
                curveTo(10.231f, 9.46901f, 10.551f, 9.59101f, 10.872f, 9.59101f)
                curveTo(11.193f, 9.59101f, 11.513f, 9.46901f, 11.756f, 9.22501f)
                lineTo(11.976f, 9.00501f)
                curveTo(12.652f, 8.33001f, 13.016f, 7.43101f, 13.001f, 6.47601f)
                curveTo(12.989f, 5.72001f, 12.741f, 5.00601f, 12.291f, 4.41701f)
                lineTo(14.354f, 2.35401f)
                curveTo(14.549f, 2.15901f, 14.549f, 1.84101f, 14.354f, 1.64601f)
                close()
                moveTo(11.268f, 8.29701f)
                lineTo(11.048f, 8.51701f)
                curveTo(10.95f, 8.61501f, 10.792f, 8.61501f, 10.694f, 8.51701f)
                lineTo(7.51198f, 5.33501f)
                curveTo(7.41398f, 5.23701f, 7.41398f, 5.07901f, 7.51198f, 4.98101f)
                lineTo(7.64298f, 4.85001f)
                curveTo(8.16698f, 4.32601f, 8.85998f, 4.06001f, 9.53998f, 4.06001f)
                curveTo(10.15f, 4.06001f, 10.751f, 4.27401f, 11.211f, 4.70801f)
                curveTo(11.709f, 5.17601f, 11.988f, 5.80901f, 11.999f, 6.49101f)
                curveTo(12.009f, 7.17301f, 11.75f, 7.81501f, 11.268f, 8.29701f)
                close()
            }
        }.build()
        
        return _DebugConnected!!
    }

private var _DebugConnected: ImageVector? = null

