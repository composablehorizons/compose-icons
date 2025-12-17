package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Import_contacts: ImageVector
    get() {
        if (_Import_contacts != null) return _Import_contacts!!
        
        _Import_contacts = ImageVector.Builder(
            name = "import_contacts",
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
                moveTo(21f, 5f)
                curveToRelative(-1.11f, -0.35f, -2.33f, -0.5f, -3.5f, -0.5f)
                curveToRelative(-1.95f, 0f, -4.05f, 0.4f, -5.5f, 1.5f)
                curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f)
                reflectiveCurveTo(2.45f, 4.9f, 1f, 6f)
                verticalLineToRelative(14.65f)
                curveToRelative(0f, 0.25f, 0.25f, 0.5f, 0.5f, 0.5f)
                curveToRelative(0.1f, 0f, 0.15f, -0.05f, 0.25f, -0.05f)
                curveTo(3.1f, 20.45f, 5.05f, 20f, 6.5f, 20f)
                curveToRelative(1.95f, 0f, 4.05f, 0.4f, 5.5f, 1.5f)
                curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f)
                curveToRelative(1.65f, 0f, 3.35f, 0.3f, 4.75f, 1.05f)
                curveToRelative(0.1f, 0.05f, 0.15f, 0.05f, 0.25f, 0.05f)
                curveToRelative(0.25f, 0f, 0.5f, -0.25f, 0.5f, -0.5f)
                verticalLineTo(6f)
                curveToRelative(-0.6f, -0.45f, -1.25f, -0.75f, -2f, -1f)
                close()
                moveTo(3f, 18.5f)
                verticalLineTo(7f)
                curveToRelative(1.1f, -0.35f, 2.3f, -0.5f, 3.5f, -0.5f)
                curveToRelative(1.34f, 0f, 3.13f, 0.41f, 4.5f, 0.99f)
                verticalLineToRelative(11.5f)
                curveTo(9.63f, 18.41f, 7.84f, 18f, 6.5f, 18f)
                curveToRelative(-1.2f, 0f, -2.4f, 0.15f, -3.5f, 0.5f)
                close()
                moveToRelative(18f, 0f)
                curveToRelative(-1.1f, -0.35f, -2.3f, -0.5f, -3.5f, -0.5f)
                curveToRelative(-1.34f, 0f, -3.13f, 0.41f, -4.5f, 0.99f)
                verticalLineTo(7.49f)
                curveToRelative(1.37f, -0.59f, 3.16f, -0.99f, 4.5f, -0.99f)
                curveToRelative(1.2f, 0f, 2.4f, 0.15f, 3.5f, 0.5f)
                verticalLineToRelative(11.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 7.49f)
                curveToRelative(-1.37f, -0.58f, -3.16f, -0.99f, -4.5f, -0.99f)
                curveToRelative(-1.2f, 0f, -2.4f, 0.15f, -3.5f, 0.5f)
                verticalLineToRelative(11.5f)
                curveToRelative(1.1f, -0.35f, 2.3f, -0.5f, 3.5f, -0.5f)
                curveToRelative(1.34f, 0f, 3.13f, 0.41f, 4.5f, 0.99f)
                verticalLineTo(7.49f)
                close()
            }
        }.build()
        
        return _Import_contacts!!
    }

private var _Import_contacts: ImageVector? = null

