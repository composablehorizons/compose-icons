package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Import_contacts: ImageVector
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
                moveTo(17.5f, 4.5f)
                curveToRelative(-1.95f, 0f, -4.05f, 0.4f, -5.5f, 1.5f)
                curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f)
                curveToRelative(-1.45f, 0f, -2.99f, 0.22f, -4.28f, 0.79f)
                curveTo(1.49f, 5.62f, 1f, 6.33f, 1f, 7.14f)
                verticalLineToRelative(11.28f)
                curveToRelative(0f, 1.3f, 1.22f, 2.26f, 2.48f, 1.94f)
                curveToRelative(0.98f, -0.25f, 2.02f, -0.36f, 3.02f, -0.36f)
                curveToRelative(1.56f, 0f, 3.22f, 0.26f, 4.56f, 0.92f)
                curveToRelative(0.6f, 0.3f, 1.28f, 0.3f, 1.87f, 0f)
                curveToRelative(1.34f, -0.67f, 3f, -0.92f, 4.56f, -0.92f)
                curveToRelative(1f, 0f, 2.04f, 0.11f, 3.02f, 0.36f)
                curveToRelative(1.26f, 0.33f, 2.48f, -0.63f, 2.48f, -1.94f)
                verticalLineTo(7.14f)
                curveToRelative(0f, -0.81f, -0.49f, -1.52f, -1.22f, -1.85f)
                curveToRelative(-1.28f, -0.57f, -2.82f, -0.79f, -4.27f, -0.79f)
                close()
                moveTo(21f, 17.23f)
                curveToRelative(0f, 0.63f, -0.58f, 1.09f, -1.2f, 0.98f)
                curveToRelative(-0.75f, -0.14f, -1.53f, -0.2f, -2.3f, -0.2f)
                curveToRelative(-1.7f, 0f, -4.15f, 0.65f, -5.5f, 1.5f)
                verticalLineTo(8f)
                curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f)
                curveToRelative(0.92f, 0f, 1.83f, 0.09f, 2.7f, 0.28f)
                curveToRelative(0.46f, 0.1f, 0.8f, 0.51f, 0.8f, 0.98f)
                verticalLineToRelative(9.47f)
                close()
            }
        }.build()
        
        return _Import_contacts!!
    }

private var _Import_contacts: ImageVector? = null

