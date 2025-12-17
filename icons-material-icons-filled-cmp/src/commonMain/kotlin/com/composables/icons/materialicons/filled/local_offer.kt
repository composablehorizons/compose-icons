package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Local_offer: ImageVector
    get() {
        if (_Local_offer != null) return _Local_offer!!
        
        _Local_offer = ImageVector.Builder(
            name = "local_offer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.41f, 11.58f)
                lineToRelative(-9f, -9f)
                curveTo(12.05f, 2.22f, 11.55f, 2f, 11f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, 0.22f, 1.05f, 0.59f, 1.42f)
                lineToRelative(9f, 9f)
                curveToRelative(0.36f, 0.36f, 0.86f, 0.58f, 1.41f, 0.58f)
                curveToRelative(0.55f, 0f, 1.05f, -0.22f, 1.41f, -0.59f)
                lineToRelative(7f, -7f)
                curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f)
                curveToRelative(0f, -0.55f, -0.23f, -1.06f, -0.59f, -1.42f)
                close()
                moveTo(5.5f, 7f)
                curveTo(4.67f, 7f, 4f, 6.33f, 4f, 5.5f)
                reflectiveCurveTo(4.67f, 4f, 5.5f, 4f)
                reflectiveCurveTo(7f, 4.67f, 7f, 5.5f)
                reflectiveCurveTo(6.33f, 7f, 5.5f, 7f)
                close()
            }
        }.build()
        
        return _Local_offer!!
    }

private var _Local_offer: ImageVector? = null

