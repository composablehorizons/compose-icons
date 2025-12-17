package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PciCardSound: ImageVector
    get() {
        if (_PciCardSound != null) return _PciCardSound!!
        
        _PciCardSound = ImageVector.Builder(
            name = "pci-card-sound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.562f, 7.39f)
                lineTo(8f, 7.04f)
                verticalLineToRelative(1.92f)
                lineToRelative(-0.438f, -0.35f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.312f, -0.11f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.312f, -0.11f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(1f)
                verticalLineToRelative(12.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(12f)
                horizontalLineToRelative(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(2f)
                verticalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
                moveToRelative(11.619f, 3.881f)
                quadToRelative(0.15f, 0.173f, 0.28f, 0.367f)
                curveToRelative(0.484f, 0.726f, 0.768f, 1.7f, 0.768f, 2.752f)
                reflectiveCurveToRelative(-0.284f, 2.026f, -0.768f, 2.752f)
                quadToRelative(-0.13f, 0.195f, -0.28f, 0.367f)
                lineToRelative(-0.71f, -0.71f)
                quadToRelative(0.082f, -0.096f, 0.158f, -0.212f)
                curveToRelative(0.36f, -0.54f, 0.6f, -1.315f, 0.6f, -2.197f)
                reflectiveCurveToRelative(-0.24f, -1.657f, -0.6f, -2.198f)
                arcToRelative(3f, 3f, 0f, false, false, -0.157f, -0.212f)
                close()
                moveToRelative(-1.375f, 4.863f)
                lineTo(10f, 9f)
                curveToRelative(0.057f, 0f, 0.17f, -0.035f, 0.291f, -0.217f)
                curveToRelative(0.12f, -0.178f, 0.209f, -0.454f, 0.209f, -0.783f)
                curveToRelative(0f, -0.33f, -0.09f, -0.605f, -0.209f, -0.783f)
                curveTo(10.17f, 7.035f, 10.057f, 7f, 10f, 7f)
                lineToRelative(0.744f, -0.744f)
                curveToRelative(0.15f, 0.113f, 0.278f, 0.254f, 0.38f, 0.406f)
                curveToRelative(0.242f, 0.364f, 0.376f, 0.839f, 0.376f, 1.338f)
                reflectiveCurveToRelative(-0.134f, 0.974f, -0.377f, 1.338f)
                arcToRelative(1.7f, 1.7f, 0f, false, true, -0.379f, 0.406f)
                moveTo(9f, 6f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.812f, 0.39f)
                lineTo(7.075f, 9.5f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.075f)
                lineToRelative(1.113f, -0.89f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 6f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 12.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                close()
                moveToRelative(0.5f, 1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _PciCardSound!!
    }

private var _PciCardSound: ImageVector? = null

