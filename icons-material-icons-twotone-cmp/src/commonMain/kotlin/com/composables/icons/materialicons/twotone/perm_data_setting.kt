package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Perm_data_setting: ImageVector
    get() {
        if (_Perm_data_setting != null) return _Perm_data_setting!!
        
        _Perm_data_setting = ImageVector.Builder(
            name = "perm_data_setting",
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
                moveTo(17.99f, 11.57f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                lineTo(0f, 20f)
                horizontalLineToRelative(11.56f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4.83f)
                lineTo(17.99f, 4.83f)
                verticalLineToRelative(6.74f)
                close()
                moveToRelative(5.78f, 8.75f)
                lineToRelative(-1.07f, -0.83f)
                curveToRelative(0.02f, -0.16f, 0.04f, -0.32f, 0.04f, -0.49f)
                curveToRelative(0f, -0.17f, -0.01f, -0.33f, -0.04f, -0.49f)
                lineToRelative(1.06f, -0.83f)
                curveToRelative(0.09f, -0.08f, 0.12f, -0.21f, 0.06f, -0.32f)
                lineToRelative(-1f, -1.73f)
                curveToRelative(-0.06f, -0.11f, -0.19f, -0.15f, -0.31f, -0.11f)
                lineToRelative(-1.24f, 0.5f)
                curveToRelative(-0.26f, -0.2f, -0.54f, -0.37f, -0.85f, -0.49f)
                lineToRelative(-0.19f, -1.32f)
                curveToRelative(-0.01f, -0.12f, -0.12f, -0.21f, -0.24f, -0.21f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.12f, 0f, -0.23f, 0.09f, -0.25f, 0.21f)
                lineToRelative(-0.19f, 1.32f)
                curveToRelative(-0.3f, 0.13f, -0.59f, 0.29f, -0.85f, 0.49f)
                lineToRelative(-1.24f, -0.5f)
                curveToRelative(-0.11f, -0.04f, -0.24f, 0f, -0.31f, 0.11f)
                lineToRelative(-1f, 1.73f)
                curveToRelative(-0.06f, 0.11f, -0.04f, 0.24f, 0.06f, 0.32f)
                lineToRelative(1.06f, 0.83f)
                curveToRelative(-0.02f, 0.16f, -0.03f, 0.32f, -0.03f, 0.49f)
                curveToRelative(0f, 0.17f, 0.01f, 0.33f, 0.03f, 0.49f)
                lineToRelative(-1.06f, 0.83f)
                curveToRelative(-0.09f, 0.08f, -0.12f, 0.21f, -0.06f, 0.32f)
                lineToRelative(1f, 1.73f)
                curveToRelative(0.06f, 0.11f, 0.19f, 0.15f, 0.31f, 0.11f)
                lineToRelative(1.24f, -0.5f)
                curveToRelative(0.26f, 0.2f, 0.54f, 0.37f, 0.85f, 0.49f)
                lineToRelative(0.19f, 1.32f)
                curveToRelative(0.02f, 0.12f, 0.12f, 0.21f, 0.25f, 0.21f)
                horizontalLineToRelative(2f)
                curveToRelative(0.12f, 0f, 0.23f, -0.09f, 0.25f, -0.21f)
                lineToRelative(0.19f, -1.32f)
                curveToRelative(0.3f, -0.13f, 0.59f, -0.29f, 0.84f, -0.49f)
                lineToRelative(1.25f, 0.5f)
                curveToRelative(0.11f, 0.04f, 0.24f, 0f, 0.31f, -0.11f)
                lineToRelative(1f, -1.73f)
                curveToRelative(0.06f, -0.11f, 0.03f, -0.24f, -0.06f, -0.32f)
                close()
                moveToRelative(-4.78f, 0.18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.build()
        
        return _Perm_data_setting!!
    }

private var _Perm_data_setting: ImageVector? = null

