package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.House_siding: ImageVector
    get() {
        if (_House_siding != null) return _House_siding!!
        
        _House_siding = ImageVector.Builder(
            name = "house_siding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 12f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0.46f, 0f, 0.68f, -0.57f, 0.33f, -0.87f)
                lineTo(12.67f, 3.6f)
                curveToRelative(-0.38f, -0.34f, -0.96f, -0.34f, -1.34f, 0f)
                lineToRelative(-8.36f, 7.53f)
                curveTo(2.63f, 11.43f, 2.84f, 12f, 3.3f, 12f)
                horizontalLineTo(5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(12f)
                close()
                moveTo(7.21f, 10f)
                horizontalLineToRelative(9.58f)
                lineTo(17f, 10.19f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineToRelative(-1.81f)
                lineTo(7.21f, 10f)
                close()
                moveTo(14.57f, 8f)
                horizontalLineTo(9.43f)
                lineTo(12f, 5.69f)
                lineTo(14.57f, 8f)
                close()
                moveTo(7f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        
        return _House_siding!!
    }

private var _House_siding: ImageVector? = null

