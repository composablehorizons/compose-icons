package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Edit_location: ImageVector
    get() {
        if (_Edit_location != null) return _Edit_location!!
        
        _Edit_location = ImageVector.Builder(
            name = "edit_location",
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
                moveTo(18.17f, 4.91f)
                lineTo(17.1f, 3.84f)
                lineToRelative(-5.55f, 5.55f)
                verticalLineToRelative(1.08f)
                horizontalLineToRelative(1.08f)
                lineToRelative(5.54f, -5.56f)
                close()
                moveTo(16f, 2.74f)
                lineToRelative(1.29f, -1.29f)
                arcToRelative(1.49f, 1.49f, 0f, false, true, 2.12f, 0f)
                lineToRelative(1.15f, 1.15f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
                lineToRelative(-0.68f, 0.68f)
                lineToRelative(-0.02f, 0.02f)
                lineToRelative(-0.58f, 0.58f)
                lineToRelative(-6f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(8.74f)
                lineToRelative(6f, -6f)
                close()
                moveToRelative(-2.28f, -0.55f)
                lineToRelative(-0.55f, 0.55f)
                lineToRelative(-1.27f, 1.27f)
                curveToRelative(-3.3f, 0.05f, -5.9f, 2.6f, -5.9f, 6.2f)
                curveToRelative(0f, 2.34f, 1.95f, 5.44f, 6f, 9.14f)
                curveToRelative(4.05f, -3.7f, 6f, -6.79f, 6f, -9.14f)
                verticalLineToRelative(-0.1f)
                lineToRelative(1.8f, -1.8f)
                curveToRelative(0.13f, 0.6f, 0.2f, 1.24f, 0.2f, 1.9f)
                curveToRelative(0f, 3.32f, -2.67f, 7.25f, -8f, 11.8f)
                curveToRelative(-5.33f, -4.55f, -8f, -8.48f, -8f, -11.8f)
                curveToRelative(0f, -4.98f, 3.8f, -8.2f, 8f, -8.2f)
                curveToRelative(0.58f, 0f, 1.16f, 0.06f, 1.72f, 0.18f)
                close()
            }
        }.build()
        
        return _Edit_location!!
    }

private var _Edit_location: ImageVector? = null

