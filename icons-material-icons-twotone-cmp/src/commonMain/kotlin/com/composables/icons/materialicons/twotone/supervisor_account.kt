package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Supervisor_account: ImageVector
    get() {
        if (_Supervisor_account != null) return _Supervisor_account!!
        
        _Supervisor_account = ImageVector.Builder(
            name = "supervisor_account",
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
                moveTo(10.5f, 8.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9f, 10f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 8.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.77f, 17f)
                horizontalLineToRelative(4.28f)
                curveToRelative(0.01f, -0.06f, 0.12f, -0.58f, 0.29f, -0.99f)
                curveToRelative(-0.11f, 0f, -0.23f, -0.01f, -0.34f, -0.01f)
                curveToRelative(-1.53f, 0f, -3.25f, 0.5f, -4.23f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 12f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(10.93f, 5f, 9f, 5f)
                reflectiveCurveTo(5.5f, 6.57f, 5.5f, 8.5f)
                reflectiveCurveTo(7.07f, 12f, 9f, 12f)
                close()
                moveToRelative(0f, -5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(9.83f, 10f, 9f, 10f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(8.17f, 7f, 9f, 7f)
                close()
                moveToRelative(0.05f, 10f)
                horizontalLineTo(4.77f)
                curveToRelative(0.99f, -0.5f, 2.7f, -1f, 4.23f, -1f)
                curveToRelative(0.11f, 0f, 0.23f, 0.01f, 0.34f, 0.01f)
                curveToRelative(0.34f, -0.73f, 0.93f, -1.33f, 1.64f, -1.81f)
                curveToRelative(-0.73f, -0.13f, -1.42f, -0.2f, -1.98f, -0.2f)
                curveToRelative(-2.34f, 0f, -7f, 1.17f, -7f, 3.5f)
                verticalLineTo(19f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.05f, -0.5f)
                close()
                moveToRelative(7.45f, -2.5f)
                curveToRelative(-1.84f, 0f, -5.5f, 1.01f, -5.5f, 3f)
                verticalLineTo(19f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.99f, -3.66f, -3f, -5.5f, -3f)
                close()
                moveToRelative(1.21f, -1.82f)
                curveToRelative(0.76f, -0.43f, 1.29f, -1.24f, 1.29f, -2.18f)
                curveTo(19f, 9.12f, 17.88f, 8f, 16.5f, 8f)
                reflectiveCurveTo(14f, 9.12f, 14f, 10.5f)
                curveToRelative(0f, 0.94f, 0.53f, 1.75f, 1.29f, 2.18f)
                curveToRelative(0.36f, 0.2f, 0.77f, 0.32f, 1.21f, 0.32f)
                reflectiveCurveToRelative(0.85f, -0.12f, 1.21f, -0.32f)
                close()
            }
        }.build()
        
        return _Supervisor_account!!
    }

private var _Supervisor_account: ImageVector? = null

