package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Contact_mail: ImageVector
    get() {
        if (_Contact_mail != null) return _Contact_mail!!
        
        _Contact_mail = ImageVector.Builder(
            name = "contact_mail",
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
                moveTo(2f, 19f)
                horizontalLineToRelative(20f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                verticalLineToRelative(14f)
                close()
                moveTo(14f, 6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-7f)
                verticalLineTo(6f)
                close()
                moveTo(9f, 6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(3f, 16.59f)
                curveTo(3f, 14.08f, 6.97f, 13f, 9f, 13f)
                reflectiveCurveToRelative(6f, 1.08f, 6f, 3.58f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineToRelative(-1.41f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 3f)
                horizontalLineTo(2f)
                curveTo(0.9f, 3f, 0f, 3.9f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(20f)
                curveToRelative(1.1f, 0f, 1.99f, -0.9f, 1.99f, -2f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(14f)
                close()
                moveTo(21f, 6f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(7f)
                verticalLineTo(6f)
                close()
                moveToRelative(-1f, 2f)
                lineToRelative(-2.5f, 1.75f)
                lineTo(15f, 8f)
                verticalLineTo(7f)
                lineToRelative(2.5f, 1.75f)
                lineTo(20f, 7f)
                verticalLineToRelative(1f)
                close()
                moveTo(9f, 12f)
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
                moveToRelative(6f, 8.59f)
                curveToRelative(0f, -2.5f, -3.97f, -3.58f, -6f, -3.58f)
                reflectiveCurveToRelative(-6f, 1.08f, -6f, 3.58f)
                verticalLineTo(18f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1.41f)
                close()
                moveTo(5.48f, 16f)
                curveToRelative(0.74f, -0.5f, 2.22f, -1f, 3.52f, -1f)
                reflectiveCurveToRelative(2.77f, 0.49f, 3.52f, 1f)
                horizontalLineTo(5.48f)
                close()
            }
        }.build()
        
        return _Contact_mail!!
    }

private var _Contact_mail: ImageVector? = null

