package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PeopleCarry: ImageVector
    get() {
        if (_PeopleCarry != null) return _PeopleCarry!!
        
        _PeopleCarry = ImageVector.Builder(
            name = "people-carry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(128f, 96f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                reflectiveCurveTo(154.5f, 0f, 128f, 0f)
                reflectiveCurveTo(80f, 21.5f, 80f, 48f)
                reflectiveCurveToRelative(21.5f, 48f, 48f, 48f)
                close()
                moveToRelative(384f, 0f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                reflectiveCurveTo(538.5f, 0f, 512f, 0f)
                reflectiveCurveToRelative(-48f, 21.5f, -48f, 48f)
                reflectiveCurveToRelative(21.5f, 48f, 48f, 48f)
                close()
                moveToRelative(125.7f, 372.1f)
                lineToRelative(-44f, -110f)
                lineToRelative(-41.1f, 46.4f)
                lineToRelative(-2f, 18.2f)
                lineToRelative(27.7f, 69.2f)
                curveToRelative(5f, 12.5f, 17f, 20.1f, 29.7f, 20.1f)
                curveToRelative(4f, 0f, 8f, -0.7f, 11.9f, -2.3f)
                curveToRelative(16.4f, -6.6f, 24.4f, -25.2f, 17.8f, -41.6f)
                close()
                moveToRelative(-34.2f, -209.8f)
                lineTo(585f, 178.1f)
                curveToRelative(-4.6f, -20f, -18.6f, -36.8f, -37.5f, -44.9f)
                curveToRelative(-18.5f, -8f, -39f, -6.7f, -56.1f, 3.3f)
                curveToRelative(-22.7f, 13.4f, -39.7f, 34.5f, -48.1f, 59.4f)
                lineTo(432f, 229.8f)
                lineTo(416f, 240f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineTo(240f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(96f)
                lineToRelative(-16.1f, -10.2f)
                lineToRelative(-11.3f, -33.9f)
                curveToRelative(-8.3f, -25f, -25.4f, -46f, -48.1f, -59.4f)
                curveToRelative(-17.2f, -10f, -37.6f, -11.3f, -56.1f, -3.3f)
                curveToRelative(-18.9f, 8.1f, -32.9f, 24.9f, -37.5f, 44.9f)
                lineToRelative(-18.4f, 80.2f)
                curveToRelative(-4.6f, 20f, 0.7f, 41.2f, 14.4f, 56.7f)
                lineToRelative(67.2f, 75.9f)
                lineToRelative(10.1f, 92.6f)
                curveTo(130f, 499.8f, 143.8f, 512f, 160f, 512f)
                curveToRelative(1.2f, 0f, 2.3f, -0.1f, 3.5f, -0.2f)
                curveToRelative(17.6f, -1.9f, 30.2f, -17.7f, 28.3f, -35.3f)
                lineToRelative(-10.1f, -92.8f)
                curveToRelative(-1.5f, -13f, -6.9f, -25.1f, -15.6f, -35f)
                lineToRelative(-43.3f, -49f)
                lineToRelative(17.6f, -70.3f)
                lineToRelative(6.8f, 20.4f)
                curveToRelative(4.1f, 12.5f, 11.9f, 23.4f, 24.5f, 32.6f)
                lineToRelative(51.1f, 32.5f)
                curveToRelative(4.6f, 2.9f, 12.1f, 4.6f, 17.2f, 5f)
                horizontalLineToRelative(160f)
                curveToRelative(5.1f, -0.4f, 12.6f, -2.1f, 17.2f, -5f)
                lineToRelative(51.1f, -32.5f)
                curveToRelative(12.6f, -9.2f, 20.4f, -20f, 24.5f, -32.6f)
                lineToRelative(6.8f, -20.4f)
                lineToRelative(17.6f, 70.3f)
                lineToRelative(-43.3f, 49f)
                curveToRelative(-8.7f, 9.9f, -14.1f, 22f, -15.6f, 35f)
                lineToRelative(-10.1f, 92.8f)
                curveToRelative(-1.9f, 17.6f, 10.8f, 33.4f, 28.3f, 35.3f)
                curveToRelative(1.2f, 0.1f, 2.3f, 0.2f, 3.5f, 0.2f)
                curveToRelative(16.1f, 0f, 30f, -12.1f, 31.8f, -28.5f)
                lineToRelative(10.1f, -92.6f)
                lineToRelative(67.2f, -75.9f)
                curveToRelative(13.6f, -15.5f, 19f, -36.7f, 14.4f, -56.7f)
                close()
                moveTo(46.3f, 358.1f)
                lineToRelative(-44f, 110f)
                curveToRelative(-6.6f, 16.4f, 1.4f, 35f, 17.8f, 41.6f)
                curveToRelative(16.8f, 6.6f, 35.1f, -1.7f, 41.6f, -17.8f)
                lineToRelative(27.7f, -69.2f)
                lineToRelative(-2f, -18.2f)
                lineToRelative(-41.1f, -46.4f)
                close()
            }
        }.build()
        
        return _PeopleCarry!!
    }

private var _PeopleCarry: ImageVector? = null

