package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CallIncoming: ImageVector
    get() {
        if (_CallIncoming != null) return _CallIncoming!!
        
        _CallIncoming = ImageVector.Builder(
            name = "call-incoming",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.8536f, 2.14646f)
                curveTo(14.0488f, 2.34172f, 14.0488f, 2.65831f, 13.8536f, 2.85357f)
                lineTo(10.7071f, 6.00002f)
                horizontalLineTo(12.5023f)
                curveTo(12.7785f, 6.00002f, 13.0023f, 6.22387f, 13.0023f, 6.50002f)
                curveTo(13.0023f, 6.77616f, 12.7785f, 7.00002f, 12.5023f, 7.00002f)
                horizontalLineTo(9.50001f)
                curveTo(9.22387f, 7.00002f, 9.00001f, 6.77616f, 9.00001f, 6.50002f)
                verticalLineTo(3.50002f)
                curveTo(9.00001f, 3.22387f, 9.22387f, 3.00002f, 9.50001f, 3.00002f)
                curveTo(9.77615f, 3.00002f, 10f, 3.22387f, 10f, 3.50002f)
                verticalLineTo(5.29291f)
                lineTo(13.1465f, 2.14646f)
                curveTo(13.3417f, 1.9512f, 13.6583f, 1.9512f, 13.8536f, 2.14646f)
                close()
                moveTo(4.37402f, 2.11973f)
                curveTo(5.22505f, 1.79979f, 6.17932f, 2.18483f, 6.57002f, 3.00579f)
                lineTo(7.15443f, 4.23378f)
                curveTo(7.40334f, 4.75682f, 7.32886f, 5.37643f, 6.96308f, 5.82558f)
                lineTo(6.01811f, 6.98592f)
                curveTo(6.03186f, 7.05633f, 6.05088f, 7.14298f, 6.0767f, 7.24156f)
                curveTo(6.15122f, 7.52611f, 6.27952f, 7.89904f, 6.49337f, 8.26517f)
                curveTo(6.7073f, 8.63144f, 6.96869f, 8.9262f, 7.17941f, 9.1306f)
                curveTo(7.25102f, 9.20007f, 7.31586f, 9.2582f, 7.36966f, 9.30427f)
                lineTo(8.87589f, 9.02762f)
                curveTo(9.37208f, 8.93648f, 9.88084f, 9.10087f, 10.2299f, 9.46513f)
                lineTo(11.0386f, 10.309f)
                curveTo(11.7108f, 11.0106f, 11.6829f, 12.1255f, 10.9763f, 12.7924f)
                lineTo(10.6803f, 13.0719f)
                curveTo(9.55432f, 14.1347f, 7.8006f, 14.3617f, 6.54567f, 13.3186f)
                curveTo(5.60587f, 12.5374f, 4.4774f, 11.439f, 3.62796f, 10.1058f)
                curveTo(2.68712f, 8.62912f, 2.24786f, 6.87525f, 2.03977f, 5.55517f)
                curveTo(1.80244f, 4.04964f, 2.76051f, 2.72633f, 4.11086f, 2.21867f)
                lineTo(4.37402f, 2.11973f)
                close()
                moveTo(7.23618f, 9.83715f)
                curveTo(6.94732f, 10.2453f, 6.94712f, 10.2451f, 6.94712f, 10.2451f)
                lineTo(6.9453f, 10.2438f)
                lineTo(6.94228f, 10.2417f)
                lineTo(6.93329f, 10.2351f)
                curveTo(6.92602f, 10.2298f, 6.91622f, 10.2226f, 6.90411f, 10.2134f)
                curveTo(6.87992f, 10.1951f, 6.84644f, 10.1692f, 6.80549f, 10.1359f)
                curveTo(6.72369f, 10.0693f, 6.61138f, 9.97277f, 6.48314f, 9.84839f)
                curveTo(6.22816f, 9.60105f, 5.90227f, 9.2359f, 5.62986f, 8.76951f)
                curveTo(5.35738f, 8.30298f, 5.19945f, 7.83905f, 5.10932f, 7.49491f)
                curveTo(5.06399f, 7.32182f, 5.0351f, 7.1763f, 5.01733f, 7.07215f)
                curveTo(5.00844f, 7.02001f, 5.00229f, 6.97803f, 4.99825f, 6.94791f)
                curveTo(4.99623f, 6.93284f, 4.99473f, 6.92073f, 4.99367f, 6.91177f)
                lineTo(4.99241f, 6.90073f)
                lineTo(4.99201f, 6.89703f)
                lineTo(4.99187f, 6.89564f)
                curveTo(4.99187f, 6.89564f, 4.99176f, 6.89457f, 5.48915f, 6.84363f)
                lineTo(4.99176f, 6.89457f)
                curveTo(4.97824f, 6.76263f, 5.0177f, 6.63073f, 5.10146f, 6.52789f)
                lineTo(6.18768f, 5.1941f)
                curveTo(6.30961f, 5.04439f, 6.33444f, 4.83785f, 6.25146f, 4.6635f)
                lineTo(5.66706f, 3.43551f)
                curveTo(5.49962f, 3.08367f, 5.09064f, 2.91865f, 4.72591f, 3.05577f)
                lineTo(4.46276f, 3.1547f)
                curveTo(3.47805f, 3.5249f, 2.87645f, 4.44077f, 3.02757f, 5.39945f)
                curveTo(3.22632f, 6.66024f, 3.63692f, 8.25884f, 4.47133f, 9.56848f)
                curveTo(5.24463f, 10.7822f, 6.28883f, 11.8047f, 7.1849f, 12.5496f)
                curveTo(7.98839f, 13.2174f, 9.17328f, 13.1192f, 9.99382f, 12.3447f)
                lineTo(10.2899f, 12.0652f)
                curveTo(10.5927f, 11.7794f, 10.6047f, 11.3016f, 10.3166f, 11.0009f)
                lineTo(9.50787f, 10.157f)
                curveTo(9.39152f, 10.0356f, 9.22193f, 9.98078f, 9.05654f, 10.0112f)
                lineTo(7.32651f, 10.3289f)
                curveTo(7.194f, 10.3533f, 7.05709f, 10.323f, 6.94712f, 10.2451f)
                lineTo(7.23618f, 9.83715f)
                close()
            }
        }.build()
        
        return _CallIncoming!!
    }

private var _CallIncoming: ImageVector? = null

