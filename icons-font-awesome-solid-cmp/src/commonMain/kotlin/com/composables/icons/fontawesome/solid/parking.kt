package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Parking: ImageVector
    get() {
        if (_Parking != null) return _Parking!!
        
        _Parking = ImageVector.Builder(
            name = "parking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveTo(240f, 320f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 8.8f, -7.2f, 16f, -16f, 16f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                verticalLineTo(144f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                horizontalLineToRelative(96f)
                curveToRelative(52.9f, 0f, 96f, 43.1f, 96f, 96f)
                reflectiveCurveToRelative(-43.1f, 96f, -96f, 96f)
                close()
                moveToRelative(0f, -128f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(48f)
                curveToRelative(17.6f, 0f, 32f, -14.4f, 32f, -32f)
                reflectiveCurveToRelative(-14.4f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _Parking!!
    }

private var _Parking: ImageVector? = null

