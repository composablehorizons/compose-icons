package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Local_offer: ImageVector
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
                verticalLineTo(0f)
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
                reflectiveCurveToRelative(1.05f, -0.22f, 1.41f, -0.59f)
                lineToRelative(7f, -7f)
                curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f)
                reflectiveCurveToRelative(-0.23f, -1.06f, -0.59f, -1.42f)
                close()
                moveTo(13f, 20.01f)
                lineTo(4f, 11f)
                verticalLineTo(4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-0.01f)
                lineToRelative(9f, 9f)
                lineToRelative(-7f, 7.02f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8f, 6.5f)
                close()
            }
        }.build()
        
        return _Local_offer!!
    }

private var _Local_offer: ImageVector? = null

