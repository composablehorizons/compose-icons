package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Attachment: ImageVector
    get() {
        if (_Attachment != null) return _Attachment!!
        
        _Attachment = ImageVector.Builder(
            name = "attachment",
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
                moveTo(2f, 12.5f)
                curveTo(2f, 9.46f, 4.46f, 7f, 7.5f, 7f)
                horizontalLineTo(18f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                horizontalLineTo(9.5f)
                curveTo(8.12f, 15f, 7f, 13.88f, 7f, 12.5f)
                reflectiveCurveTo(8.12f, 10f, 9.5f, 10f)
                horizontalLineTo(17f)
                verticalLineToRelative(2f)
                horizontalLineTo(9.41f)
                curveToRelative(-0.55f, 0f, -0.55f, 1f, 0f, 1f)
                horizontalLineTo(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                horizontalLineTo(7.5f)
                curveTo(5.57f, 9f, 4f, 10.57f, 4f, 12.5f)
                reflectiveCurveTo(5.57f, 16f, 7.5f, 16f)
                horizontalLineTo(17f)
                verticalLineToRelative(2f)
                horizontalLineTo(7.5f)
                curveTo(4.46f, 18f, 2f, 15.54f, 2f, 12.5f)
                close()
            }
        }.build()
        
        return _Attachment!!
    }

private var _Attachment: ImageVector? = null

