package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Perm_contact_calendar: ImageVector
    get() {
        if (_Perm_contact_calendar != null) return _Perm_contact_calendar!!
        
        _Perm_contact_calendar = ImageVector.Builder(
            name = "perm_contact_calendar",
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
                moveTo(16f, 5f)
                horizontalLineTo(5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(14f)
                verticalLineTo(5f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(-4f, 1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveToRelative(6f, 12f)
                horizontalLineTo(6f)
                verticalLineToRelative(-1.53f)
                curveToRelative(0f, -2.5f, 3.97f, -3.58f, 6f, -3.58f)
                reflectiveCurveToRelative(6f, 1.08f, 6f, 3.58f)
                verticalLineTo(18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.84f, 4.22f)
                curveToRelative(-0.05f, -0.12f, -0.11f, -0.23f, -0.18f, -0.34f)
                curveToRelative(-0.14f, -0.21f, -0.33f, -0.4f, -0.54f, -0.54f)
                curveToRelative(-0.11f, -0.07f, -0.22f, -0.13f, -0.34f, -0.18f)
                curveToRelative(-0.24f, -0.1f, -0.5f, -0.16f, -0.78f, -0.16f)
                horizontalLineToRelative(-1f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                curveToRelative(-0.42f, 0f, -0.8f, 0.13f, -1.12f, 0.34f)
                curveToRelative(-0.21f, 0.14f, -0.4f, 0.33f, -0.54f, 0.54f)
                curveToRelative(-0.07f, 0.11f, -0.13f, 0.22f, -0.18f, 0.34f)
                curveToRelative(-0.1f, 0.24f, -0.16f, 0.5f, -0.16f, 0.78f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(0.28f, 0f, 0.54f, -0.06f, 0.78f, -0.16f)
                curveToRelative(0.12f, -0.05f, 0.23f, -0.11f, 0.34f, -0.18f)
                curveToRelative(0.21f, -0.14f, 0.4f, -0.33f, 0.54f, -0.54f)
                curveToRelative(0.21f, -0.32f, 0.34f, -0.71f, 0.34f, -1.12f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.28f, -0.06f, -0.54f, -0.16f, -0.78f)
                close()
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(-7f, -6.12f)
                curveToRelative(-2.03f, 0f, -6f, 1.08f, -6f, 3.58f)
                verticalLineTo(18f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1.53f)
                curveToRelative(0f, -2.51f, -3.97f, -3.59f, -6f, -3.59f)
                close()
                moveTo(8.31f, 16f)
                curveToRelative(0.69f, -0.56f, 2.38f, -1.12f, 3.69f, -1.12f)
                reflectiveCurveToRelative(3.01f, 0.56f, 3.69f, 1.12f)
                horizontalLineTo(8.31f)
                close()
                moveTo(12f, 12f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                close()
                moveToRelative(0f, -4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
            }
        }.build()
        
        return _Perm_contact_calendar!!
    }

private var _Perm_contact_calendar: ImageVector? = null

