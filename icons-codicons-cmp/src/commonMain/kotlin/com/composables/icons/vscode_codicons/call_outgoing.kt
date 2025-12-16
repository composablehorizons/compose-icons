package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CallOutgoing: ImageVector
    get() {
        if (_CallOutgoing != null) return _CallOutgoing!!
        
        _CallOutgoing = ImageVector.Builder(
            name = "call-outgoing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2.5f)
                curveTo(10f, 2.22386f, 10.2239f, 2f, 10.5f, 2f)
                horizontalLineTo(13.5f)
                curveTo(13.7762f, 2f, 14f, 2.22386f, 14f, 2.5f)
                verticalLineTo(5.5f)
                curveTo(14f, 5.77614f, 13.7762f, 6f, 13.5f, 6f)
                curveTo(13.2239f, 6f, 13f, 5.77614f, 13f, 5.5f)
                verticalLineTo(3.70713f)
                lineTo(9.85356f, 6.85365f)
                curveTo(9.6583f, 7.04891f, 9.34172f, 7.04892f, 9.14646f, 6.85366f)
                curveTo(8.95119f, 6.6584f, 8.95119f, 6.34181f, 9.14645f, 6.14655f)
                lineTo(12.2929f, 3f)
                horizontalLineTo(10.5f)
                curveTo(10.2239f, 3f, 10f, 2.77614f, 10f, 2.5f)
                close()
                moveTo(4.37402f, 2.11972f)
                curveTo(5.22505f, 1.79977f, 6.17932f, 2.18481f, 6.57002f, 3.00577f)
                lineTo(7.15443f, 4.23376f)
                curveTo(7.40334f, 4.7568f, 7.32886f, 5.37641f, 6.96308f, 5.82556f)
                lineTo(6.01811f, 6.9859f)
                curveTo(6.03186f, 7.05631f, 6.05088f, 7.14296f, 6.0767f, 7.24154f)
                curveTo(6.15122f, 7.52609f, 6.27952f, 7.89902f, 6.49337f, 8.26515f)
                curveTo(6.7073f, 8.63143f, 6.96869f, 8.92618f, 7.17941f, 9.13058f)
                curveTo(7.25102f, 9.20005f, 7.31586f, 9.25819f, 7.36966f, 9.30425f)
                lineTo(8.87589f, 9.0276f)
                curveTo(9.37208f, 8.93646f, 9.88084f, 9.10086f, 10.2299f, 9.46511f)
                lineTo(11.0386f, 10.309f)
                curveTo(11.7108f, 11.0106f, 11.6829f, 12.1254f, 10.9763f, 12.7924f)
                lineTo(10.6803f, 13.0718f)
                curveTo(9.55432f, 14.1347f, 7.8006f, 14.3617f, 6.54567f, 13.3186f)
                curveTo(5.60587f, 12.5374f, 4.4774f, 11.439f, 3.62796f, 10.1058f)
                curveTo(2.68712f, 8.6291f, 2.24786f, 6.87523f, 2.03977f, 5.55515f)
                curveTo(1.80244f, 4.04962f, 2.76051f, 2.72631f, 4.11086f, 2.21865f)
                lineTo(4.37402f, 2.11972f)
                close()
                moveTo(7.23618f, 9.83713f)
                curveTo(6.94732f, 10.2452f, 6.94712f, 10.2451f, 6.94712f, 10.2451f)
                lineTo(6.9453f, 10.2438f)
                lineTo(6.94228f, 10.2416f)
                lineTo(6.93329f, 10.2351f)
                curveTo(6.92602f, 10.2298f, 6.91622f, 10.2226f, 6.90411f, 10.2134f)
                curveTo(6.87992f, 10.1951f, 6.84644f, 10.1692f, 6.80549f, 10.1358f)
                curveTo(6.72369f, 10.0693f, 6.61138f, 9.97276f, 6.48314f, 9.84837f)
                curveTo(6.22816f, 9.60103f, 5.90227f, 9.23588f, 5.62986f, 8.76949f)
                curveTo(5.35738f, 8.30296f, 5.19945f, 7.83904f, 5.10932f, 7.49489f)
                curveTo(5.06399f, 7.32181f, 5.0351f, 7.17628f, 5.01733f, 7.07213f)
                curveTo(5.00844f, 7.01999f, 5.00229f, 6.97801f, 4.99825f, 6.94789f)
                curveTo(4.99623f, 6.93282f, 4.99473f, 6.92071f, 4.99367f, 6.91175f)
                lineTo(4.99241f, 6.90071f)
                lineTo(4.99201f, 6.89701f)
                lineTo(4.99187f, 6.89562f)
                curveTo(4.99187f, 6.89562f, 4.99176f, 6.89455f, 5.48915f, 6.84361f)
                lineTo(4.99176f, 6.89455f)
                curveTo(4.97824f, 6.76261f, 5.0177f, 6.63071f, 5.10146f, 6.52787f)
                lineTo(6.18768f, 5.19408f)
                curveTo(6.30961f, 5.04437f, 6.33444f, 4.83783f, 6.25146f, 4.66348f)
                lineTo(5.66706f, 3.43549f)
                curveTo(5.49962f, 3.08365f, 5.09064f, 2.91864f, 4.72591f, 3.05575f)
                lineTo(4.46276f, 3.15469f)
                curveTo(3.47805f, 3.52488f, 2.87645f, 4.44075f, 3.02757f, 5.39943f)
                curveTo(3.22632f, 6.66022f, 3.63692f, 8.25882f, 4.47133f, 9.56846f)
                curveTo(5.24463f, 10.7822f, 6.28883f, 11.8047f, 7.1849f, 12.5495f)
                curveTo(7.98839f, 13.2174f, 9.17328f, 13.1192f, 9.99382f, 12.3447f)
                lineTo(10.2899f, 12.0652f)
                curveTo(10.5927f, 11.7794f, 10.6047f, 11.3016f, 10.3166f, 11.0009f)
                lineTo(9.50787f, 10.157f)
                curveTo(9.39152f, 10.0356f, 9.22193f, 9.98077f, 9.05654f, 10.0111f)
                lineTo(7.32651f, 10.3289f)
                curveTo(7.194f, 10.3532f, 7.05709f, 10.3229f, 6.94712f, 10.2451f)
                lineTo(7.23618f, 9.83713f)
                close()
            }
        }.build()
        
        return _CallOutgoing!!
    }

private var _CallOutgoing: ImageVector? = null

