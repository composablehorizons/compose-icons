package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Vaccines: ImageVector
    get() {
        if (_Vaccines != null) return _Vaccines!!
        
        _Vaccines = ImageVector.Builder(
            name = "vaccines",
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
                moveTo(19f, 17f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(4f)
                verticalLineTo(17f)
                close()
                moveTo(9f, 7.5f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineToRelative(4f)
                lineToRelative(0f, -1.5f)
                horizontalLineTo(7.25f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                curveTo(6.5f, 12.34f, 6.84f, 12f, 7.25f, 12f)
                horizontalLineTo(9f)
                verticalLineToRelative(-1.5f)
                horizontalLineTo(7.25f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                curveTo(6.5f, 9.34f, 6.84f, 9f, 7.25f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 5.5f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineTo(6f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                verticalLineTo(15f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                lineToRelative(2f, 1.5f)
                verticalLineTo(17f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(7.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveTo(12f, 5.95f, 11.55f, 5.5f, 11f, 5.5f)
                close()
                moveTo(9f, 9f)
                horizontalLineTo(7.25f)
                curveTo(6.84f, 9f, 6.5f, 9.34f, 6.5f, 9.75f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(7.25f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineTo(9f)
                lineTo(9f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(4f)
                verticalLineTo(9f)
                close()
                moveTo(19.5f, 10.5f)
                verticalLineTo(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.5f, -1.5f, 1.16f, -1.5f, 3f)
                verticalLineTo(20f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-6.5f)
                curveTo(21f, 11.66f, 19.5f, 11f, 19.5f, 10.5f)
                close()
                moveTo(16.5f, 10.5f)
                verticalLineTo(10f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.6f, 1.5f, 2f, 1.5f, 3f)
                verticalLineTo(14f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -0.21f, 0f, -0.39f, 0f, -0.5f)
                curveTo(15f, 12.5f, 16.5f, 12.1f, 16.5f, 10.5f)
                close()
                moveTo(19f, 15.5f)
                verticalLineTo(17f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -0.51f, 0f, -1.02f, 0f, -1.5f)
                horizontalLineTo(19f)
                close()
                moveTo(15f, 20f)
                curveToRelative(0f, 0f, 0f, -0.63f, 0f, -1.5f)
                horizontalLineToRelative(4f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                close()
            }
        }.build()
        
        return _Vaccines!!
    }

private var _Vaccines: ImageVector? = null

