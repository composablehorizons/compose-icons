package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.BugAnt: ImageVector
    get() {
        if (_BugAnt != null) return _BugAnt!!
        
        _BugAnt = ImageVector.Builder(
            name = "bug-ant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.56f, 1.14f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.177f, 1.045f)
                arcToRelative(3.989f, 3.989f, 0f, false, false, -0.464f, 0.86f)
                curveToRelative(0.185f, 0.17f, 0.382f, 0.329f, 0.59f, 0.473f)
                arcTo(3.993f, 3.993f, 0f, false, true, 10f, 2f)
                curveToRelative(1.272f, 0f, 2.405f, 0.594f, 3.137f, 1.518f)
                curveToRelative(0.208f, -0.144f, 0.405f, -0.302f, 0.59f, -0.473f)
                arcToRelative(3.989f, 3.989f, 0f, false, false, -0.464f, -0.86f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.222f, -0.869f)
                curveToRelative(0.369f, 0.519f, 0.65f, 1.105f, 0.822f, 1.736f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.174f, 0.707f)
                arcToRelative(7.03f, 7.03f, 0f, false, true, -1.299f, 1.098f)
                arcTo(4f, 4f, 0f, false, true, 14f, 6f)
                curveToRelative(0f, 0.52f, -0.301f, 0.963f, -0.723f, 1.187f)
                arcToRelative(6.961f, 6.961f, 0f, false, true, -1.158f, 0.486f)
                curveToRelative(0.13f, 0.208f, 0.231f, 0.436f, 0.296f, 0.679f)
                curveToRelative(1.413f, -0.174f, 2.779f, -0.5f, 4.081f, -0.96f)
                arcToRelative(19.655f, 19.655f, 0f, false, false, -0.09f, -2.319f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.493f, -0.146f)
                arcToRelative(21.239f, 21.239f, 0f, false, true, 0.08f, 3.028f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.482f, 0.667f)
                arcToRelative(20.873f, 20.873f, 0f, false, true, -5.153f, 1.249f)
                arcToRelative(2.521f, 2.521f, 0f, false, true, -0.107f, 0.247f)
                arcToRelative(20.945f, 20.945f, 0f, false, true, 5.252f, 1.257f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.482f, 0.74f)
                arcToRelative(20.945f, 20.945f, 0f, false, true, -0.908f, 5.107f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.433f, -0.444f)
                curveToRelative(0.415f, -1.34f, 0.69f, -2.743f, 0.806f, -4.191f)
                curveToRelative(-0.495f, -0.173f, -1f, -0.327f, -1.512f, -0.46f)
                curveToRelative(0.05f, 0.284f, 0.076f, 0.575f, 0.076f, 0.873f)
                curveToRelative(0f, 1.814f, -0.517f, 3.312f, -1.426f, 4.37f)
                arcTo(4.639f, 4.639f, 0f, false, true, 10f, 19f)
                arcToRelative(4.639f, 4.639f, 0f, false, true, -3.574f, -1.63f)
                curveTo(5.516f, 16.311f, 5f, 14.813f, 5f, 13f)
                curveToRelative(0f, -0.298f, 0.026f, -0.59f, 0.076f, -0.873f)
                curveToRelative(-0.513f, 0.133f, -1.017f, 0.287f, -1.512f, 0.46f)
                curveToRelative(0.116f, 1.448f, 0.39f, 2.85f, 0.806f, 4.191f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.433f, 0.444f)
                arcToRelative(20.94f, 20.94f, 0f, false, true, -0.908f, -5.107f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.482f, -0.74f)
                arcToRelative(20.838f, 20.838f, 0f, false, true, 5.252f, -1.257f)
                arcToRelative(2.493f, 2.493f, 0f, false, true, -0.107f, -0.247f)
                arcToRelative(20.874f, 20.874f, 0f, false, true, -5.153f, -1.249f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.482f, -0.667f)
                arcToRelative(21.342f, 21.342f, 0f, false, true, 0.08f, -3.028f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.493f, 0.146f)
                arcToRelative(19.745f, 19.745f, 0f, false, false, -0.09f, 2.319f)
                curveToRelative(1.302f, 0.46f, 2.668f, 0.786f, 4.08f, 0.96f)
                curveToRelative(0.066f, -0.243f, 0.166f, -0.471f, 0.297f, -0.679f)
                arcToRelative(6.962f, 6.962f, 0f, false, true, -1.158f, -0.486f)
                arcTo(1.348f, 1.348f, 0f, false, true, 6f, 6f)
                arcToRelative(4f, 4f, 0f, false, true, 0.166f, -1.143f)
                arcToRelative(7.032f, 7.032f, 0f, false, true, -1.3f, -1.098f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.173f, -0.707f)
                arcToRelative(5.48f, 5.48f, 0f, false, true, 0.822f, -1.736f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.046f, -0.177f)
                close()
            }
        }.build()
        
        return _BugAnt!!
    }

private var _BugAnt: ImageVector? = null

