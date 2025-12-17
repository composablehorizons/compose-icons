package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Passport: ImageVector
    get() {
        if (_Passport != null) return _Passport!!
        
        _Passport = ImageVector.Builder(
            name = "passport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(129.62f, 176f)
                horizontalLineToRelative(39.09f)
                curveToRelative(1.49f, -27.03f, 6.54f, -51.35f, 14.21f, -70.41f)
                curveToRelative(-27.71f, 13.24f, -48.02f, 39.19f, -53.3f, 70.41f)
                close()
                moveToRelative(0f, 32f)
                curveToRelative(5.29f, 31.22f, 25.59f, 57.17f, 53.3f, 70.41f)
                curveToRelative(-7.68f, -19.06f, -12.72f, -43.38f, -14.21f, -70.41f)
                horizontalLineToRelative(-39.09f)
                close()
                moveTo(224f, 286.69f)
                curveToRelative(7.69f, -7.45f, 20.77f, -34.42f, 23.43f, -78.69f)
                horizontalLineToRelative(-46.87f)
                curveToRelative(2.67f, 44.26f, 15.75f, 71.24f, 23.44f, 78.69f)
                close()
                moveTo(200.57f, 176f)
                horizontalLineToRelative(46.87f)
                curveToRelative(-2.66f, -44.26f, -15.74f, -71.24f, -23.43f, -78.69f)
                curveToRelative(-7.7f, 7.45f, -20.78f, 34.43f, -23.44f, 78.69f)
                close()
                moveToRelative(64.51f, 102.41f)
                curveToRelative(27.71f, -13.24f, 48.02f, -39.19f, 53.3f, -70.41f)
                horizontalLineToRelative(-39.09f)
                curveToRelative(-1.49f, 27.03f, -6.53f, 51.35f, -14.21f, 70.41f)
                close()
                moveTo(416f, 0f)
                horizontalLineTo(64f)
                curveTo(28.65f, 0f, 0f, 28.65f, 0f, 64f)
                verticalLineToRelative(384f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 64f, 64f)
                horizontalLineToRelative(352f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(-80f, 416f)
                horizontalLineTo(112f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                reflectiveCurveToRelative(7.2f, -16f, 16f, -16f)
                horizontalLineToRelative(224f)
                curveToRelative(8.8f, 0f, 16f, 7.2f, 16f, 16f)
                reflectiveCurveToRelative(-7.2f, 16f, -16f, 16f)
                close()
                moveToRelative(-112f, -96f)
                curveToRelative(-70.69f, 0f, -128f, -57.31f, -128f, -128f)
                reflectiveCurveTo(153.31f, 64f, 224f, 64f)
                reflectiveCurveToRelative(128f, 57.31f, 128f, 128f)
                reflectiveCurveToRelative(-57.31f, 128f, -128f, 128f)
                close()
                moveToRelative(41.08f, -214.41f)
                curveToRelative(7.68f, 19.06f, 12.72f, 43.38f, 14.21f, 70.41f)
                horizontalLineToRelative(39.09f)
                curveToRelative(-5.28f, -31.22f, -25.59f, -57.17f, -53.3f, -70.41f)
                close()
            }
        }.build()
        
        return _Passport!!
    }

private var _Passport: ImageVector? = null

