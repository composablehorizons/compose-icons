package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Ankh: ImageVector
    get() {
        if (_Ankh != null) return _Ankh!!
        
        _Ankh = ImageVector.Builder(
            name = "ankh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(296f, 256f)
                horizontalLineToRelative(-44.62f)
                curveTo(272.46f, 222.01f, 288f, 181.65f, 288f, 144f)
                curveTo(288f, 55.63f, 230.69f, 0f, 160f, 0f)
                reflectiveCurveTo(32f, 55.63f, 32f, 144f)
                curveToRelative(0f, 37.65f, 15.54f, 78.01f, 36.62f, 112f)
                horizontalLineTo(24f)
                curveToRelative(-13.25f, 0f, -24f, 10.74f, -24f, 24f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 13.25f, 10.75f, 24f, 24f, 24f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(152f)
                curveToRelative(0f, 13.25f, 10.75f, 24f, 24f, 24f)
                horizontalLineToRelative(32f)
                curveToRelative(13.25f, 0f, 24f, -10.75f, 24f, -24f)
                verticalLineTo(336f)
                horizontalLineToRelative(96f)
                curveToRelative(13.25f, 0f, 24f, -10.75f, 24f, -24f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -13.26f, -10.75f, -24f, -24f, -24f)
                close()
                moveTo(160f, 80f)
                curveToRelative(29.61f, 0f, 48f, 24.52f, 48f, 64f)
                curveToRelative(0f, 34.66f, -27.14f, 78.14f, -48f, 100.87f)
                curveToRelative(-20.86f, -22.72f, -48f, -66.21f, -48f, -100.87f)
                curveToRelative(0f, -39.48f, 18.39f, -64f, 48f, -64f)
                close()
            }
        }.build()
        
        return _Ankh!!
    }

private var _Ankh: ImageVector? = null

