package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeDoc: ImageVector
    get() {
        if (_FiletypeDoc != null) return _FiletypeDoc!!
        
        _FiletypeDoc = ImageVector.Builder(
            name = "filetype-doc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.5f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 3f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(5.5f)
                close()
                moveToRelative(-7.839f, 9.166f)
                verticalLineToRelative(0.522f)
                quadToRelative(0f, 0.384f, -0.117f, 0.641f)
                arcToRelative(0.86f, 0.86f, 0f, false, true, -0.322f, 0.387f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, -0.469f, 0.126f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, -0.471f, -0.126f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, -0.32f, -0.386f)
                arcToRelative(1.55f, 1.55f, 0f, false, true, -0.117f, -0.642f)
                verticalLineToRelative(-0.522f)
                quadToRelative(0f, -0.386f, 0.117f, -0.641f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, 0.32f, -0.387f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, 0.471f, -0.129f)
                quadToRelative(0.264f, 0f, 0.469f, 0.13f)
                arcToRelative(0.86f, 0.86f, 0f, false, true, 0.322f, 0.386f)
                quadToRelative(0.117f, 0.255f, 0.117f, 0.641f)
                moveToRelative(0.803f, 0.519f)
                verticalLineToRelative(-0.513f)
                quadToRelative(0f, -0.565f, -0.205f, -0.972f)
                arcToRelative(1.46f, 1.46f, 0f, false, false, -0.589f, -0.63f)
                quadToRelative(-0.381f, -0.22f, -0.917f, -0.22f)
                quadToRelative(-0.533f, 0f, -0.92f, 0.22f)
                arcToRelative(1.44f, 1.44f, 0f, false, false, -0.589f, 0.627f)
                quadToRelative(-0.204f, 0.406f, -0.205f, 0.975f)
                verticalLineToRelative(0.513f)
                quadToRelative(0f, 0.563f, 0.205f, 0.973f)
                quadToRelative(0.205f, 0.406f, 0.59f, 0.627f)
                quadToRelative(0.386f, 0.216f, 0.92f, 0.216f)
                quadToRelative(0.535f, 0f, 0.916f, -0.216f)
                quadToRelative(0.383f, -0.22f, 0.59f, -0.627f)
                quadToRelative(0.204f, -0.41f, 0.204f, -0.973f)
                moveTo(0f, 11.926f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1.459f)
                quadToRelative(0.603f, 0f, 0.999f, -0.238f)
                arcToRelative(1.45f, 1.45f, 0f, false, false, 0.595f, -0.689f)
                quadToRelative(0.196f, -0.45f, 0.196f, -1.084f)
                quadToRelative(0f, -0.63f, -0.196f, -1.075f)
                arcToRelative(1.43f, 1.43f, 0f, false, false, -0.59f, -0.68f)
                quadToRelative(-0.395f, -0.234f, -1.004f, -0.234f)
                close()
                moveToRelative(0.791f, 0.645f)
                horizontalLineToRelative(0.563f)
                quadToRelative(0.371f, 0f, 0.609f, 0.152f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, 0.354f, 0.454f)
                quadToRelative(0.118f, 0.302f, 0.118f, 0.753f)
                arcToRelative(2.3f, 2.3f, 0f, false, true, -0.068f, 0.592f)
                arcToRelative(1.1f, 1.1f, 0f, false, true, -0.196f, 0.422f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.334f, 0.252f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, -0.483f, 0.082f)
                horizontalLineTo(0.79f)
                verticalLineTo(12.57f)
                close()
                moveToRelative(7.422f, 0.483f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, -0.103f, 0.633f)
                verticalLineToRelative(0.495f)
                quadToRelative(0f, 0.369f, 0.103f, 0.627f)
                arcToRelative(0.83f, 0.83f, 0f, false, false, 0.298f, 0.393f)
                arcToRelative(0.85f, 0.85f, 0f, false, false, 0.478f, 0.131f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, 0.401f, -0.088f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, 0.273f, -0.248f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.117f, -0.364f)
                horizontalLineToRelative(0.765f)
                verticalLineToRelative(0.076f)
                arcToRelative(1.27f, 1.27f, 0f, false, true, -0.226f, 0.674f)
                quadToRelative(-0.205f, 0.29f, -0.55f, 0.454f)
                arcToRelative(1.8f, 1.8f, 0f, false, true, -0.786f, 0.164f)
                quadToRelative(-0.54f, 0f, -0.914f, -0.216f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, -0.571f, -0.627f)
                quadToRelative(-0.194f, -0.408f, -0.194f, -0.976f)
                verticalLineToRelative(-0.498f)
                quadToRelative(0f, -0.568f, 0.197f, -0.978f)
                quadToRelative(0.195f, -0.411f, 0.571f, -0.633f)
                quadToRelative(0.378f, -0.223f, 0.911f, -0.223f)
                quadToRelative(0.328f, 0f, 0.607f, 0.097f)
                quadToRelative(0.28f, 0.093f, 0.489f, 0.272f)
                arcToRelative(1.33f, 1.33f, 0f, false, true, 0.466f, 0.964f)
                verticalLineToRelative(0.073f)
                horizontalLineTo(9.78f)
                arcToRelative(0.85f, 0.85f, 0f, false, false, -0.12f, -0.38f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, -0.273f, -0.261f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, -0.398f, -0.097f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, -0.475f, 0.138f)
                arcToRelative(0.87f, 0.87f, 0f, false, false, -0.301f, 0.398f)
            }
        }.build()
        
        return _FiletypeDoc!!
    }

private var _FiletypeDoc: ImageVector? = null

