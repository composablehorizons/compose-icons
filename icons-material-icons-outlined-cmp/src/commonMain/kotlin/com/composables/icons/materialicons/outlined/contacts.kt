package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Contacts: ImageVector
    get() {
        if (_Contacts != null) return _Contacts!!
        
        _Contacts = ImageVector.Builder(
            name = "contacts",
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
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                close()
                moveTo(4f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                close()
                moveToRelative(0f, 22f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                close()
                moveToRelative(8f, -10f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(13.38f, 7f, 12f, 7f)
                reflectiveCurveTo(9.5f, 8.12f, 9.5f, 9.5f)
                reflectiveCurveTo(10.62f, 12f, 12f, 12f)
                close()
                moveToRelative(0f, -3.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveToRelative(5f, 7.49f)
                curveTo(17f, 13.9f, 13.69f, 13f, 12f, 13f)
                reflectiveCurveToRelative(-5f, 0.9f, -5f, 2.99f)
                verticalLineTo(17f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1.01f)
                close()
                moveToRelative(-8.19f, -0.49f)
                curveToRelative(0.61f, -0.52f, 2.03f, -1f, 3.19f, -1f)
                curveToRelative(1.17f, 0f, 2.59f, 0.48f, 3.2f, 1f)
                horizontalLineTo(8.81f)
                close()
            }
        }.build()
        
        return _Contacts!!
    }

private var _Contacts: ImageVector? = null

