package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Headphones: ImageVector
    get() {
        if (_Headphones != null) return _Headphones!!
        
        _Headphones = ImageVector.Builder(
            name = "headphones",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 32f)
                curveTo(114.52f, 32f, 0f, 146.496f, 0f, 288f)
                verticalLineToRelative(48f)
                arcToRelative(32f, 32f, 0f, false, false, 17.689f, 28.622f)
                lineToRelative(14.383f, 7.191f)
                curveTo(34.083f, 431.903f, 83.421f, 480f, 144f, 480f)
                horizontalLineToRelative(24f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(280f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineToRelative(-24f)
                curveToRelative(-31.342f, 0f, -59.671f, 12.879f, -80f, 33.627f)
                verticalLineTo(288f)
                curveToRelative(0f, -105.869f, 86.131f, -192f, 192f, -192f)
                reflectiveCurveToRelative(192f, 86.131f, 192f, 192f)
                verticalLineToRelative(1.627f)
                curveTo(427.671f, 268.879f, 399.342f, 256f, 368f, 256f)
                horizontalLineToRelative(-24f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(176f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(24f)
                curveToRelative(60.579f, 0f, 109.917f, -48.098f, 111.928f, -108.187f)
                lineToRelative(14.382f, -7.191f)
                arcTo(32f, 32f, 0f, false, false, 512f, 336f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -141.479f, -114.496f, -256f, -256f, -256f)
                close()
            }
        }.build()
        
        return _Headphones!!
    }

private var _Headphones: ImageVector? = null

