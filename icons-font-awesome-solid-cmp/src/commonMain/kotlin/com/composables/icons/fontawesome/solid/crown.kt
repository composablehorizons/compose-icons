package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Crown: ImageVector
    get() {
        if (_Crown != null) return _Crown!!
        
        _Crown = ImageVector.Builder(
            name = "crown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(528f, 448f)
                horizontalLineTo(112f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(416f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveToRelative(64f, -320f)
                curveToRelative(-26.5f, 0f, -48f, 21.5f, -48f, 48f)
                curveToRelative(0f, 7.1f, 1.6f, 13.7f, 4.4f, 19.8f)
                lineTo(476f, 239.2f)
                curveToRelative(-15.4f, 9.2f, -35.3f, 4f, -44.2f, -11.6f)
                lineTo(350.3f, 85f)
                curveTo(361f, 76.2f, 368f, 63f, 368f, 48f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                reflectiveCurveToRelative(-48f, 21.5f, -48f, 48f)
                curveToRelative(0f, 15f, 7f, 28.2f, 17.7f, 37f)
                lineToRelative(-81.5f, 142.6f)
                curveToRelative(-8.9f, 15.6f, -28.9f, 20.8f, -44.2f, 11.6f)
                lineToRelative(-72.3f, -43.4f)
                curveToRelative(2.7f, -6f, 4.4f, -12.7f, 4.4f, -19.8f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                reflectiveCurveTo(0f, 149.5f, 0f, 176f)
                reflectiveCurveToRelative(21.5f, 48f, 48f, 48f)
                curveToRelative(2.6f, 0f, 5.2f, -0.4f, 7.7f, -0.8f)
                lineTo(128f, 416f)
                horizontalLineToRelative(384f)
                lineToRelative(72.3f, -192.8f)
                curveToRelative(2.5f, 0.4f, 5.1f, 0.8f, 7.7f, 0.8f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                reflectiveCurveToRelative(-21.5f, -48f, -48f, -48f)
                close()
            }
        }.build()
        
        return _Crown!!
    }

private var _Crown: ImageVector? = null

