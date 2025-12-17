package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Supervisor_account: ImageVector
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
                moveTo(16.5f, 12f)
                curveToRelative(1.38f, 0f, 2.49f, -1.12f, 2.49f, -2.5f)
                reflectiveCurveTo(17.88f, 7f, 16.5f, 7f)
                reflectiveCurveTo(14f, 8.12f, 14f, 9.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(9f, 11f)
                curveToRelative(1.66f, 0f, 2.99f, -1.34f, 2.99f, -3f)
                reflectiveCurveTo(10.66f, 5f, 9f, 5f)
                reflectiveCurveTo(6f, 6.34f, 6f, 8f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                close()
                moveToRelative(7.5f, 3f)
                curveToRelative(-1.83f, 0f, -5.5f, 0.92f, -5.5f, 2.75f)
                verticalLineTo(19f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0f, -1.83f, -3.67f, -2.75f, -5.5f, -2.75f)
                close()
                moveTo(9f, 13f)
                curveToRelative(-2.33f, 0f, -7f, 1.17f, -7f, 3.5f)
                verticalLineTo(19f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0f, -0.85f, 0.33f, -2.34f, 2.37f, -3.47f)
                curveTo(10.5f, 13.1f, 9.66f, 13f, 9f, 13f)
                close()
            }
        }.build()
        
        return _Supervisor_account!!
    }

private var _Supervisor_account: ImageVector? = null

