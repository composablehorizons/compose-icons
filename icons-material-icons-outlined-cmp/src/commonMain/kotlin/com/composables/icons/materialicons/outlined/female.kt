package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Female: ImageVector
    get() {
        if (_Female != null) return _Female!!
        
        _Female = ImageVector.Builder(
            name = "female",
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
                moveTo(17.5f, 9.5f)
                curveTo(17.5f, 6.46f, 15.04f, 4f, 12f, 4f)
                reflectiveCurveTo(6.5f, 6.46f, 6.5f, 9.5f)
                curveToRelative(0f, 2.7f, 1.94f, 4.93f, 4.5f, 5.4f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.1f)
                curveTo(15.56f, 14.43f, 17.5f, 12.2f, 17.5f, 9.5f)
                close()
                moveTo(8.5f, 9.5f)
                curveTo(8.5f, 7.57f, 10.07f, 6f, 12f, 6f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveTo(13.93f, 13f, 12f, 13f)
                reflectiveCurveTo(8.5f, 11.43f, 8.5f, 9.5f)
                close()
            }
        }.build()
        
        return _Female!!
    }

private var _Female: ImageVector? = null

