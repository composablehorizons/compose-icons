package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Person_add_disabled: ImageVector
    get() {
        if (_Person_add_disabled != null) return _Person_add_disabled!!
        
        _Person_add_disabled = ImageVector.Builder(
            name = "person_add_disabled",
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
                moveTo(14.48f, 11.95f)
                curveToRelative(0.17f, 0.02f, 0.34f, 0.05f, 0.52f, 0.05f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 0.18f, 0.03f, 0.35f, 0.05f, 0.52f)
                lineToRelative(3.43f, 3.43f)
                close()
                moveToRelative(2.21f, 2.21f)
                lineTo(22.53f, 20f)
                horizontalLineTo(23f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.14f, -3.56f, -3.5f, -6.31f, -3.84f)
                close()
                moveTo(0f, 3.12f)
                lineToRelative(4f, 4f)
                verticalLineTo(10f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.88f)
                lineToRelative(2.51f, 2.51f)
                curveTo(9.19f, 15.11f, 7f, 16.3f, 7f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9.88f)
                lineToRelative(4f, 4f)
                lineToRelative(1.41f, -1.41f)
                lineTo(1.41f, 1.71f)
                lineTo(0f, 3.12f)
                close()
                moveTo(6.88f, 10f)
                horizontalLineTo(6f)
                verticalLineToRelative(-0.88f)
                lineToRelative(0.88f, 0.88f)
                close()
            }
        }.build()
        
        return _Person_add_disabled!!
    }

private var _Person_add_disabled: ImageVector? = null

